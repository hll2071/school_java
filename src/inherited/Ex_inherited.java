package inherited;
abstract class Phone {
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

    public abstract void call();
    public abstract void ai();
    public abstract void make();
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

        Phone pho = new Phone() {
            @Override
            public void ai() {
                System.out.println("꼇누아이");
            }

            @Override
            public void call() {
                System.out.println("아아안이이이");
            }

            @Override
            public void make() {
                System.out.println("공장에서");
            }
        };

        Galaxy gal = new Galaxy();
        Iphone iph = new Iphone();

        Galaxy axy = new Galaxy("갤럭시 A7", "버즈 프로", "안드로이드", 2);

        gal.setModel("갤럭시 s22+");
        gal.setBluetooth("버즈");
        gal.setUnyoung("안드로이드");
        System.out.println(gal.getModel());

        iph.setModel("아이폰 15pro");
        iph.setBluetooth("에어팟");
        iph.setUnyoung("OS");
        System.out.println(iph.getModel());

        Phone[] phones = new Phone[] {new Galaxy(), new Iphone(), pho};
        for(Phone phone : phones) {
            phone.ai();
            phone.call();
            phone.make();
        }
    }
}
