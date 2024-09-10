package inherited;
class Phone {
    private String model;
    private String bluetooth;
    private String unyoung;
    public String getModel() {
        return model;
    }
    public String getBluetooth() {
        return bluetooth;
    }
    public String getUnyoung() {
        return unyoung;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }
    public void setUnyoung(String unyoung) {
        this.unyoung = unyoung;
    }

    public void call() {
        System.out.println("전화가 울려용");
    }
    public void ai() {
        System.out.println("Ai가 있어용");
    }
    public void make() {
        System.out.println("어디서 만들었을까용");
    }
    public Phone(String model, String bluetooth, String unyoung) {
        this.model = model;
        this.bluetooth = bluetooth;
        this.unyoung = unyoung;
    }
    public Phone() {}
}
class Galaxy extends Phone {
    private int camera;
    @Override
    public void ai() {
        System.out.println("이 폰의 Ai는 빅스비 입니다.");
    }
    @Override
    public void call() {
        System.out.println("빠라빠빠빠");
    }
    @Override
    public void make() {
        System.out.println("삼성에서 만들었습니다.");
    }
    public Galaxy(String model, String bluetooth, String unyoung,int camera) {
        super(model,bluetooth,unyoung);

        this.camera = camera;
    }
    public Galaxy() {}
}
class Iphone extends Phone {
    @Override
    public void ai() {
        System.out.println("이 폰의 Ai는 시리에용");
    }
    @Override
    public void call() {
        System.out.println("띠링띠링");
    }
    @Override
    public void make() {
        System.out.println("애플에서 만들었어용");
    }
}
public class Ex_inherited {
    public static void main(String[] args) {
        Phone pho = new Phone();
        Galaxy gal = new Galaxy();
        Iphone iph = new Iphone();

        Galaxy axy = new Galaxy("갤럭시 A7", "버즈 프로", "안드로이드", 2);

        pho.setModel("꼇누스 블랙 폰");
        pho.setBluetooth("그의 파란 이빨");
        pho.setUnyoung("김현우식 운영");
        System.out.println(pho.getModel());

        gal.setModel("갤럭시 s22+");
        gal.setBluetooth("버즈");
        gal.setUnyoung("안드로이드");
        System.out.println(gal.getModel());

        iph.setModel("아이폰 15pro");
        iph.setBluetooth("에어팟");
        iph.setUnyoung("OS");
        System.out.println(iph.getModel());

        Phone[] phones = new Phone[] {new Galaxy(), new Iphone()};
        for(Phone phone : phones) {
            phone.ai();
            phone.call();
            phone.make();
        }
    }
}
