public class TypeDataPrimitif {
    public static void main(String[] args) {
        ///type data primitif 
        //dijava semua type data buan primitif ada perwakilan data primitif
        //beberapa ada yang dirubah seperti byte jadi Byte 
        //primitif
        Byte inibyte;

        inibyte = 0;

        System.out.println(inibyte);

        //dari primitif ke non orimitif

        int iniInteger = 155;
        Integer iniInteger2 = iniInteger;

        byte inibyte1 = iniInteger2.byteValue();

        //System.out.println(iniInteger2);
        System.out.println(inibyte1);

    }
}
