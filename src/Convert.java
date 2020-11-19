class Convert {

    static int romToArab(String number) {
        int num = 0;
        String[] rom = new String[] {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        for (int i=0; i<rom.length; i++){
            if (rom[i].equals(number)) {num=i+1; break;}
        }
        return num;
    }

    static String arabToRom(int number) {

        if (number<0) number = -number;
        String num = "";
        if (number==0) num = "N";
        int dec = number / 10;
        int ed = number % 10;
        if (dec < 4) {
            for (int i = 0; i < dec; i++) {
                num += "X";
            }
        } else if (dec == 4) {
            num += "XL";
        } else if (dec == 9) {
            num += "XC";
        } else if (dec == 10) {
            num += "C";
        } else {
            num += "L";
            for (int j = 0; j < dec - 5; j++) {
                num += "X";
            }
        }
        if (ed < 4) {
            for (int i = 0; i < ed; i++) {
                num += "I";
            }
        } else if (ed == 4) {
            num += "IV";
        } else if (ed == 9) {
            num += "IX";
        } else {
            num += "V";
            for (int j = 0; j < ed - 5; j++) {
                num += "I";
            }
        }
        return num;
    }
}