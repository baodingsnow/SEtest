import java.lang.reflect.Array;

public class zifutest {



    public static void main(String[] args) {
//        StringBuilder stringBuilder=new StringBuilder("abc");
//        stringBuilder.setCharAt(0,'d');
//        System.out.println(stringBuilder);
        char[]  chs={'l','c','l'};
        char[] chs1={'c','l','y'};
        for (int i=0;i<3;i++){
            chs[i]=chs1[i];
        }
        String str1=new String(chs);
        System.out.println(str1);

    }


}
