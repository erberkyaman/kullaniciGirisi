import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password,reset;


        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adı:");
        userName=input.nextLine();
        System.out.print("Şifre:");
        password=input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş Yaptınız!");
        } else{
            System.out.print("Kullanıcı Bilgileri Hatalı!");
            System.out.print("Şifrenizi Sıfırlamak İster misiniz? (Y/N)");
            reset=input.nextLine();

            if(reset.equals("Y")){
                System.out.print("Yeni Şifrenizi Giriniz:");
                password=input.nextLine();
                if (password.equals("java123")){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else{
                    System.out.print("Şifreniz Değiştirildi!");
                }
            }else if(reset.equals("N")){
                System.out.print("Program Sonlandırıldı...");
            }else{
                System.out.print("Hatalı Giriş!");
            }
        }
    }

}
