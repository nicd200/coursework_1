class Dec2Hex {

    public static int Arg1;

    public static void main(String args[]) {


        /**
         * Checks if the argument provided has a length longer than null
         * Performed as if args is a String object.
         * If number is null then the error message will display.
         */
        if (args.length == 0){
                System.err.println("Please enter a valid number.");
                return;
            }
        /**
         * Checks to see if the given number is an integer.
         * If number is not an integer then error message will display
         */
        else if (args.length > 0) {
            try {
                Arg1 = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
            char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            int rem, num;
            num = Arg1;
            String hexadecimal = "";
            System.out.println("Converting the Decimal Value " + num + " to Hex...");

            while (num != 0) {
                rem = num % 16;
                hexadecimal = ch[rem] + hexadecimal;
                num = num / 16;
            }

            System.out.println("Hexadecimal representation is : " + hexadecimal);

        }
    }