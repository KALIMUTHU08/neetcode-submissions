class Solution {
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        System.out.print("[");
        for(int i = 0; i < nums.length - 1; i++){
            System.out.print(nums[i] + ",");
        }
        System.out.println(nums[nums.length - 1] + "]");
        return nums;
    }

    public void quicksort(int[] arr, int inicio, int fim){
        if(inicio < fim){
            int pivo = particion(arr, inicio, fim);

            quicksort(arr, inicio, pivo - 1);
            quicksort(arr, pivo + 1, fim);
        }
    }

    public int pivo(int[] arr, int inicio, int fim){
        int meio = (inicio + fim)/2;
        // Mediana dos 3
        if((arr[meio] <= arr[inicio] && arr[inicio] <= arr[fim])
         ||(arr[fim] <= arr[inicio] && arr[inicio] <= arr[meio])){
            int temp = arr[inicio];
            arr[inicio] = arr[fim];
            arr[fim] = temp;
        } else if((arr[inicio] <= arr[meio] && arr[meio] <= arr[fim])
            || (arr[fim] <= arr[meio] && arr[meio] <= arr[inicio])){
            int temp = arr[meio];
            arr[meio] = arr[fim];
            arr[fim] = temp;
        } // Else: é o proprio arr[fim]
        return arr[fim];
    }

    public int particion(int[] arr, int inicio, int fim){
        int pivo = pivo(arr, inicio, fim);
        int i = inicio - 1;

        for(int j = inicio; j < fim; j++){
            if(arr[j] < pivo){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[fim];
        arr[fim] = temp;

        return (i + 1); // return posicao pivo
    }
}