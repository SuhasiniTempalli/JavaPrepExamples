package com.java.examples;

class HappyNumber {
    public boolean isHappy(int n) {
//        int sum=0;
//        String numStr = String.valueOf(n);
//        List<Integer> result = numStr.chars().map(Character::getNumericValue).boxed().collect(Collectors.toList());
//        result.forEach(digit->System.out.print("printing"+sum+digit*digit));
//        //result.stream().reduce(0,sum(result*result));
//        System.out.println(result);

        int sum = n;
        do{
            String numStr = Integer.toString(sum);
            Integer[] integerArray = new Integer[numStr.length()];
            sum = 0;
            for(int i=0;i<numStr.length();i++) {
                integerArray[i] = Integer.parseInt(String.valueOf(numStr.charAt(i)));
                sum = sum + integerArray[i] * integerArray[i];
                System.out.println("Sum : " + sum);
            }

        }while(sum>1);

        if(sum==1 && n!=2){
            return true;
        }else
            return false;

    }

    public static void main(String args[]) {
        HappyNumber st = new HappyNumber();
        boolean flag = st.isHappy(19);
        System.out.println(flag);
    }
}