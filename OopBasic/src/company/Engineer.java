package company;

public class Engineer extends Employee{
    
    //フィールド
    String programmingLanguage;
    
    //コンストラクター
    public Engineer(String name, Department department, String position, int employeeId, String programmingLanguage) {
        super(name, department, position, employeeId);
        this.programmingLanguage = programmingLanguage;
    }
    
    //メソッド
    public void developSoftware() {
        System.out.println("ソフトウェアを開発します。名前：" + name + "　プログラミング言語" + programmingLanguage);
    }
    
    //会議に参加するメソッドをオーバーライド
    @Override
    public void joinMeeting() {
        super.joinMeeting();
        System.out.println("→技術的な準備を行い、上記の会議に参加します。名前：" + name);
    }

}