package animal;

public class Human extends  Animal implements Thinkable{

    //フィールド
    private String hobby;

    public Human(String name, int age, String hobby) {
        super(name,age);
        this.hobby = hobby;
    }

    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}
