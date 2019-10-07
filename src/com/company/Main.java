package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println(Main.dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"}));
    }
    public static String[] dirReduc(String[] arr) {
        int i = 0, k = 0, f, z = 0;
        String[] answer = new String[arr.length];
        String[] directions;
        while(i < arr.length){
            System.out.print(arr[i] + ",");
            i ++;
        }
        i = 0;
        System.out.println();
        if(arr.length == 1){
            directions = new String[1];
            directions[0] = arr[0];
        }else {
            while (arr[i + 1] != null && k != -1 ) {
                if ((arr[i].equals("NORTH") && arr[i + 1].equals("SOUTH")) || (arr[i].equals("SOUTH") && arr[i + 1].equals("NORTH"))
                        || (arr[i].equals("EAST") && arr[i + 1].equals("WEST")) || (arr[i].equals("WEST") && arr[i + 1].equals("EAST"))) {
                    arr[i] = "";
                    arr[i + 1] = "";
                    i = 0;
                    f = 0;
                    while (f < arr.length) {
                        if (arr[f] != "") {
                            answer[z] = arr[f];
                            z = z + 1;
                        }
                        f = f + 1;
                    }
                    arr = answer;
                    z = 0;
                    answer = new String[arr.length];
                } else {
                    if(i + 2 < arr.length) {
                        i++;
                    }else{
                        k = -1;
                    }
                }
            }
            f = 0;
            k = 0;
            while (f < arr.length) {
                if (arr[f] != null) {
                    k++;
                }
                f++;
            }
            directions = new String[k];
            f = 0;
            while (f < directions.length) {
                if (arr[f] != null) {
                    directions[f] = arr[f];
                }
                f++;
            }
        }
        i = 0;
        while(i < directions.length){
            System.out.println(directions[i]);
            i ++;
        }
        System.out.println(directions.length);
        return directions;
    }
}
