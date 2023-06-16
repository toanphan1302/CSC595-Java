public class HW_June07 {
    public static void main(String[] args) {
        var arr = funA();
        var hasValue24 = funcB(arr, 24);
        if (hasValue24 == true) {
            System.out.println("Array has value 24");
        } else {
            System.out.println("Array doesn't have value 24");
        }

        funcC(arr, 17);
        System.out.println("Max value = " + funD(arr));
        System.out.println("Average = " + funE(arr));

        String[][] id_Name = {
                { "486422", "Crompton, Caroline May Mary" },
                { "490751", "Delorme, Noel Francis" },
                { "491225", "Desjarlais, Stacey Lee" },
                { "493273", "Favel, Katherine Elizabeth C." },
                { "494452", "Francis, Kelly Lynn" },
                { "497561", "Goforth, Lisa Anne" },
                { "493469", "La Rose, Tia Rai" },
                { "488906", "Merasty, Yolanda Patricia" },
                { "495834", "Peigan, Anne-Marie" },
                { "493796", "Starr, Tara Joy" },
                { "496721", "Sun, Hao" },
                { "496509", "Taypotat, Morley James Dale" },
                { "494689", "Thomson, Michelle Melanie" },
                { "493657", "Toutsaint, Florence Christine" },
                { "491158", "Young, Adam Robert John" },
                { "492676", "Yuzicappi, Deanna Marlene" },
                { "494521", "Askew, Lucas Daniel" }
        };
        double[][] grade = {
                { 83, 0, 4.7, 100, 100, 100, 100, 76, 20 },
                { 89, 4.8, 0, 100, 100, 100, 84, 85, 20 },
                { 84, 5, 5, 100, 100, 92, 100, 76, 20 },
                { 86, 4.9, 4.8, 100, 100, 100, 100, 86, 20 },
                { 92, 5, 4.7, 100, 100, 100, 100, 73, 20 },
                { 0, 0, 0, 0, 82, 96, 100, 68, 16 },
                { 87, 4.9, 4.5, 100, 82, 84, 100, 71, 20 },
                { 57, 0, 0, 0, 0, 0, 0, 62, 3 },
                { 90, 4.8, 4.5, 96, 93, 0, 97, 84, 13 },
                { 94, 5, 4.7, 100, 100, 0, 100, 90, 20 },
                { 98, 4.9, 4.7, 100, 0, 0, 100, 83, 20 },
                { 96, 4.9, 4.8, 100, 100, 100, 100, 93, 17 },
                { 98, 5, 4.7, 100, 100, 100, 100, 69, 20 },
                { 80, 4.9, 4.5, 100, 100, 100, 81, 71, 11 },
                { 97, 4.9, 4.7, 100, 100, 100, 100, 85, 20 },
                { 82, 5, 5, 100, 72, 76, 100, 88, 15 },
                { 89, 5, 4.7, 80, 88, 76, 100, 68, 20 },
        };

        var averageArr = Average(grade);
        var totalNumber = TotalNumber(grade);
        var totalLetter = TotalLetter(totalNumber);
        // Print table
        for (int i = 0; i < grade.length; i++) {
            System.out.print(id_Name[i][0] + "  " + id_Name[i][1] + "\t");
            for (int j = 0; j < grade[0].length; j++) {
                System.out.print(grade[i][j] + "  ");
            }
            System.out.print(totalNumber[i] + " ");
            System.out.print(totalLetter[i]);
            System.out.println("");
        }
        System.out.print("average\t");
        for (int i = 0; i < averageArr.length; i++) {
            System.out.print(averageArr[i] + " ");
        }

    }

    public static double[] Average(double[][] grade) {
        var numberOfColumns = grade[0].length;
        var numberOfRows = grade.length;
        var averageArr = new double[numberOfRows];
        for (int i = 0; i < numberOfColumns; i++) {
            var average = 0.0;
            for (int j = 0; j < numberOfRows; j++) {
                average += grade[j][i];
            }
            averageArr[i] = average / numberOfRows;
        }
        return averageArr;
    }

    public static double[] TotalNumber(double[][] grade) {
        var totalNumber = new double[grade.length];
        for (int i = 0; i < grade.length; i++) {
            totalNumber[i] = grade[i][0] * 0.35 + grade[i][1] + grade[i][2] +
                    (grade[i][3] + grade[i][4] + grade[i][5] + grade[i][6]) * 0.05 +
                    grade[i][7] * 0.15 + grade[i][8];
        }
        return totalNumber;
    }

    public static String[] TotalLetter(double[] totalNumber) {
        String[] TotalLetter = new String[totalNumber.length];
        for (int i = 0; i < totalNumber.length; i++) {
            if ((totalNumber[i] <= 100) && (totalNumber[i] >= 97)) {
                TotalLetter[i] = "A+";
            } else if ((totalNumber[i] < 97) && (totalNumber[i] >= 93)) {
                TotalLetter[i] = "A";
            } else if ((totalNumber[i] < 93) && (totalNumber[i] >= 90)) {
                TotalLetter[i] = "A-";
            } else if ((totalNumber[i] < 90) && (totalNumber[i] >= 87)) {
                TotalLetter[i] = "B+";
            } else if ((totalNumber[i] < 87) && (totalNumber[i] >= 83)) {
                TotalLetter[i] = "B";
            } else if ((totalNumber[i] < 83) && (totalNumber[i] >= 80)) {
                TotalLetter[i] = "B-";
            } else if ((totalNumber[i] < 80) && (totalNumber[i] >= 77)) {
                TotalLetter[i] = "C+";
            } else if ((totalNumber[i] < 77) && (totalNumber[i] >= 73)) {
                TotalLetter[i] = "C";
            } else if ((totalNumber[i] < 73) && (totalNumber[i] >= 70)) {
                TotalLetter[i] = "C-";
            } else if ((totalNumber[i] < 70) && (totalNumber[i] >= 67)) {
                TotalLetter[i] = "D+";
            } else if ((totalNumber[i] < 67) && (totalNumber[i] >= 63)) {
                TotalLetter[i] = "D";
            } else if ((totalNumber[i] < 63) && (totalNumber[i] >= 60)) {
                TotalLetter[i] = "D-";
            } else if ((totalNumber[i] < 60) && (totalNumber[i] >= 0)) {
                TotalLetter[i] = "F";
            }
            // System.out.println(TotalLetter[i]);
        }
        return TotalLetter;
    }

    public static int[] funA() {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");
        return arr;
    }

    public static Boolean funcB(int[] intArray, int value) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void funcC(int[] arr, int value) {
        int temp = 0;
        int min_idx = 0;
        int first = 0;
        int last = 0;
        int mid = 0;

        // Selection sort
        for (int i = 0; i < arr.length; i++) {
            var minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Binary search
        mid = (first + last) / 2;
        first = 0;
        last = arr.length - 1;
        while (first <= last) {
            if (arr[mid] < value) {
                first = mid + 1;
            } else if (arr[mid] == value) {
                System.out.println("Element " + value + " is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }

        if (first > last) {
            System.out.println("Element " + value + " is not found!");
        }
    }

    public static int funD(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double funE(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / arr.length;
        return average;
    }
}
