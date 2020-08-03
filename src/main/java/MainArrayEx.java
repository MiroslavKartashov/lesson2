import Exception.*;

    class MainArrayEx {
        public static void main(String[] args) {
            String[][] array = new String[4][4];
             for(int i = 0; i < array.length; i++){
                for(int j= 0; j < array[i].length; j++){
                    array[i][j] = ("Строка" + j) + i;
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

            try {
                try {
                    int sum = MyArraySize.getArray(array);
                } catch (MyArraySizeException e) {
                    System.out.println(e.getMessage());
                }
            } catch (MyArrayDataException e) {
                System.out.println(e.getMessage());
            }

        }
    }