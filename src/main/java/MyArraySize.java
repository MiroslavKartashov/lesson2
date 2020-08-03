import Exception.*;

public class MyArraySize {
   public  static int getArray(String[][] myArray) throws MyArrayDataException, MyArraySizeException {
        if(myArray.length == 4 && myArray[0].length == 4) {
            System.out.println("Длина массива правильная");
        } else {
            throw new MyArraySizeException("Неверная длинна массива");
        }

        int sum = 0;
        if(myArray.length != 4) {
            throw new MyArraySizeException("Неверная длинна массива");
        }

        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i].length != 4) {
                throw new MyArraySizeException("Неверная длинна массива");
            }
        for(int j = 0; j <  myArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(myArray[i][j]);
                } catch (NumberFormatException e) {
                 throw new MyArrayDataException("Невозможно преобразовать значение  " +i + " x " + j);
                }
            }
        }

      Integer[][] intArray = new Integer[myArray.length][myArray[0].length];
       for(int i = 0; i <myArray[0].length; i++) {
         for (int j = 0; j < myArray[i].length; j++) {
              intArray[i][j] = Integer.parseInt(myArray[i][j]);
               sum += Integer.parseInt(myArray[i][j]);
                  }
        }
        return sum;
    }
}


