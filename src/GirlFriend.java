import lombok.Data;
@Data
public class GirlFriend {

    private  int age;
    private  String name;



    public int getAge() {
        if (age>=18&&age<=28){
            System.out.println();
        }
        return age;
    }
}
