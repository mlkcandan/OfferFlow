package com.offerflow.main;

import com.offerflow.ui.MainFrame;
import com.formdev.flatlaf.FlatDarkLaf;
import com.offerflow.manager.DataManager;
import com.offerflow.model.Customer;
import com.offerflow.model.JobPosting;
import com.offerflow.model.Provider;
import com.offerflow.model.UserProfile;
import javax.swing.UIManager;

public class MainApp {

    public static void main(String[] args) {

        Provider provider1 = new Provider(
                "emirhan@gmail.com",
                "emirhan123",
                new UserProfile(
                        "Emirhan Erbay",
                        "05321002030",
                        "Niğde",
                        "2 yıllık tecrübeyle, üstün mimari profesyonel backend gösterişli frontend hizmetleriniz için..."
                )
        );
        DataManager.registerUser(provider1);

        Provider provider2 = new Provider(
                "zeynep.design@hotmail.com",
                "zeynep2024",
                new UserProfile(
                        "Zeynep Kaya",
                        "05559876543",
                        "İstanbul",
                        "Profesyonel logo, afiş ve kurumsal kimlik tasarımı. Freelance grafik tasarım hizmetleri."
                )
        );
        DataManager.registerUser(provider2);

        Provider provider3 = new Provider(
                "tahsin.nakliyat@yahoo.com",
                "nakliye35",
                new UserProfile(
                        "Tahsin Demir",
                        "05421112233",
                        "İzmir",
                        "Şehir içi ve şehirler arası sigortalı, asansörlü evden eve nakliyat hizmeti."
                )
        );
        DataManager.registerUser(provider3);

        Provider provider4 = new Provider(
                "evrenaykac@gmail.com",
                "evren123",
                new UserProfile(
                        "Evren Aykac",
                        "05421112233",
                        "Ankara",
                        "C ve Java yazılım dillerinde özel dersleriniz için hizmetinizdeyiz."
                )
        );
        DataManager.registerUser(provider4);

        Customer customer1 = new Customer(
                "elif.yilmaz@gmail.com",
                "elif123",
                new UserProfile(
                        "Elif Yılmaz",
                        "05051234567",
                        "Bursa",
                        "Öğrenci evi için detaylı temizlik hizmeti arıyorum, uygun fiyatlı olması tercihimdir."
                )
        );
        DataManager.registerUser(customer1);

        Customer customer2 = new Customer(
                "caner.ozkan@outlook.com",
                "caner2024",
                new UserProfile(
                        "Caner Özkan",
                        "05334445566",
                        "Antalya",
                        "Yeni taşındığım dairenin boya ve badana işleri için tecrübeli usta arıyorum."
                )
        );
        DataManager.registerUser(customer2);

        Customer customer3 = new Customer(
                "selin.demir@hotmail.com",
                "selin99",
                new UserProfile(
                        "Selin Demir",
                        "05447778899",
                        "Ankara",
                        "Kendi butik pastanem için basit ve şık bir web sitesi yaptırmak istiyorum."
                )
        );
        DataManager.registerUser(customer3);

        Customer customer4 = new Customer(
                "mert.kara@yahoo.com",
                "mert34",
                new UserProfile(
                        "Mert Kara",
                        "05551112233",
                        "İstanbul",
                        "Ofis mobilyalarımı Beşiktaş'tan Kadıköy'e taşıtmak istiyorum, asansörlü nakliye lazım."
                )
        );
        DataManager.registerUser(customer4);

        JobPosting jpSoft1 = new JobPosting("E-Ticaret Altyapısı", "Software", "Ürünlerinizi satabileceğiniz hazır e-ticaret sistemi kurulumu.", 25000, 14, provider1);
        DataManager.addJobGlobal(jpSoft1);
        provider1.createJobPosting(jpSoft1);

        JobPosting jpTrans1 = new JobPosting("Evden Eve Nakliyat", "Transport", "Asansörlü, sigortalı şehir içi güvenli taşıma.", 12000, 1, provider3);
        DataManager.addJobGlobal(jpTrans1);
        provider3.createJobPosting(jpTrans1);

        JobPosting jpDesign1 = new JobPosting("Kurumsal Kimlik Tasarımı", "Design", "Logo, kartvizit ve antetli kağıt tasarım paketi.", 5000, 7, provider2);
        DataManager.addJobGlobal(jpDesign1);
        provider2.createJobPosting(jpDesign1);

        JobPosting jpEdu1 = new JobPosting("Java Özel Ders (Sıfırdan)", "Education", "Nesne Yönelimli Programlama ve Java temelleri.", 750, 1, provider4);
        DataManager.addJobGlobal(jpEdu1);
        provider4.createJobPosting(jpEdu1);

        JobPosting jpRepair1 = new JobPosting("Mobilya Montajı", "Repair", "IKEA ve demonte mobilyaların profesyonel kurulumu.", 1000, 1, provider3);
        DataManager.addJobGlobal(jpRepair1);
        provider3.createJobPosting(jpRepair1);

        JobPosting jpClean1 = new JobPosting("Taşınma Öncesi Temizlik", "Cleaning", "Boş dairenin taşınmaya hazır hale getirilmesi.", 3000, 1, provider3);
        DataManager.addJobGlobal(jpClean1);
        provider3.createJobPosting(jpClean1);

        JobPosting jpOrg1 = new JobPosting("Doğum Günü Konsepti", "Organizations", "Kişiye özel parti süslemesi ve konsept tasarımı.", 5000, 1, provider2);
        DataManager.addJobGlobal(jpOrg1);
        provider2.createJobPosting(jpOrg1);

        JobPosting jpSoft2 = new JobPosting("Kurumsal Web Sitesi", "Software", "Firmanız için responsive, yönetim panelli web sitesi.", 15000, 10, provider1);
        DataManager.addJobGlobal(jpSoft2);
        provider1.createJobPosting(jpSoft2);

        JobPosting jpHealth1 = new JobPosting("Sınav Kaygısı Yönetimi", "Health", "Sınav dönemindeki öğrenciler için motivasyon koçluğu.", 1000, 1, provider4);
        DataManager.addJobGlobal(jpHealth1);
        provider4.createJobPosting(jpHealth1);

        JobPosting jpPet1 = new JobPosting("Pet Taksi", "Pet Services", "Evcil dostlarınızın veterinere güvenli transferi.", 600, 1, provider3);
        DataManager.addJobGlobal(jpPet1);
        provider3.createJobPosting(jpPet1);

        JobPosting jpRepair2 = new JobPosting("Bilgisayar Format & Bakım", "Repair", "Isınma sorunu giderme ve format atma işlemleri.", 500, 1, provider1);
        DataManager.addJobGlobal(jpRepair2);
        provider1.createJobPosting(jpRepair2);

        JobPosting jpChild1 = new JobPosting("İlköğretim Ödev Yardımı", "Child Care", "Okul sonrası ders tekrarı ve ödev kontrolü.", 600, 1, provider4);
        DataManager.addJobGlobal(jpChild1);
        provider4.createJobPosting(jpChild1);

        JobPosting jpDesign2 = new JobPosting("Sosyal Medya Yönetimi", "Design", "Instagram için aylık 15 post tasarımı ve planlama.", 7000, 30, provider2);
        DataManager.addJobGlobal(jpDesign2);
        provider2.createJobPosting(jpDesign2);

        JobPosting jpTrans2 = new JobPosting("Parça Eşya Taşıma", "Transport", "Koltuk, beyaz eşya gibi tek parça ürün nakliyesi.", 1500, 1, provider3);
        DataManager.addJobGlobal(jpTrans2);
        provider3.createJobPosting(jpTrans2);

        JobPosting jpEdu2 = new JobPosting("C Programlama Dili", "Education", "Algoritma mantığı ve C dili giriş dersleri.", 700, 1, provider4);
        DataManager.addJobGlobal(jpEdu2);
        provider4.createJobPosting(jpEdu2);

        JobPosting jpOrg2 = new JobPosting("Etkinlik Ses/Görüntü Kurulumu", "Organizations", "Projeksiyon ve ses sistemi teknik kurulumu.", 3000, 1, provider1);
        DataManager.addJobGlobal(jpOrg2);
        provider1.createJobPosting(jpOrg2);

        JobPosting jpClean2 = new JobPosting("İnşaat Sonrası Moloz Atımı", "Cleaning", "Tadilat sonrası kaba temizlik ve moloz taşıma.", 4000, 1, provider3);
        DataManager.addJobGlobal(jpClean2);
        provider3.createJobPosting(jpClean2);

        JobPosting jpHealth2 = new JobPosting("Ofis Çalışanları İçin Yoga", "Health", "Sırt ve boyun ağrılarına yönelik temel yoga dersi.", 500, 1, provider2);
        DataManager.addJobGlobal(jpHealth2);
        provider2.createJobPosting(jpHealth2);

        JobPosting jpSoft3 = new JobPosting("Mobil Uygulama (Android)", "Software", "Google Play uyumlu native mobil uygulama geliştirme.", 35000, 45, provider1);
        DataManager.addJobGlobal(jpSoft3);
        provider1.createJobPosting(jpSoft3);

        JobPosting jpPet2 = new JobPosting("Tatil Dönemi Kedi Bakımı", "Pet Services", "Siz tatildeyken kediniz kendi evinde bakılır.", 400, 1, provider4);
        DataManager.addJobGlobal(jpPet2);
        provider4.createJobPosting(jpPet2);

        JobPosting jpDesign3 = new JobPosting("Afiş ve Broşür Tasarımı", "Design", "Etkinlik ve kampanyalarınız için baskıya hazır tasarım.", 2000, 2, provider2);
        DataManager.addJobGlobal(jpDesign3);
        provider2.createJobPosting(jpDesign3);

        JobPosting jpTrans3 = new JobPosting("Şehirler Arası Nakliye", "Transport", "İzmir çıkışlı tüm illere komple ev taşıma.", 25000, 2, provider3);
        DataManager.addJobGlobal(jpTrans3);
        provider3.createJobPosting(jpTrans3);

        JobPosting jpEdu3 = new JobPosting("Veri Yapıları Özel Ders", "Education", "Linked List, Tree, Graph konuları anlatımı.", 800, 1, provider4);
        DataManager.addJobGlobal(jpEdu3);
        provider4.createJobPosting(jpEdu3);

        JobPosting jpRepair3 = new JobPosting("Ofis Taşıma ve Kurulum", "Repair", "Ofis mobilyalarının sökülüp yeni yere kurulması.", 5000, 1, provider3);
        DataManager.addJobGlobal(jpRepair3);
        provider3.createJobPosting(jpRepair3);

        JobPosting jpOrg3 = new JobPosting("Evlilik Teklifi Organizasyonu", "Organizations", "Sahilde size özel romantik konsept hazırlığı.", 8000, 1, provider2);
        DataManager.addJobGlobal(jpOrg3);
        provider2.createJobPosting(jpOrg3);

        JobPosting jpChild2 = new JobPosting("Hafta Sonu Satranç Eğitimi", "Child Care", "Çocuklar için zeka geliştirici satranç dersi.", 400, 1, provider4);
        DataManager.addJobGlobal(jpChild2);
        provider4.createJobPosting(jpChild2);

        JobPosting jpHealth3 = new JobPosting("Medikal Cihaz Kurulumu", "Health", "Ev tipi medikal cihazların kurulumu ve eğitimi.", 750, 1, provider1);
        DataManager.addJobGlobal(jpHealth3);
        provider1.createJobPosting(jpHealth3);

        JobPosting jpClean3 = new JobPosting("Bodrum ve Depo Temizliği", "Cleaning", "Gereksiz eşyaların tahliyesi ve temizlik.", 2500, 1, provider3);
        DataManager.addJobGlobal(jpClean3);
        provider3.createJobPosting(jpClean3);

        JobPosting jpPet3 = new JobPosting("Kedi/Köpek Portre Çizimi", "Pet Services", "Evcil hayvanınızın dijital illüstrasyonu.", 1000, 3, provider2);
        DataManager.addJobGlobal(jpPet3);
        provider2.createJobPosting(jpPet3);

        JobPosting jpChild3 = new JobPosting("Çocuk Odası Duvar Boyama", "Child Care", "Çocuk odaları için sanatsal duvar çizimleri.", 3000, 2, provider2);
        DataManager.addJobGlobal(jpChild3);
        provider2.createJobPosting(jpChild3);

        try {

            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {

            System.err.println("Tema yüklenemedi. Hata: " + ex.getMessage());
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                MainFrame anaPencere = new MainFrame();

                anaPencere.setLocationRelativeTo(null);

                anaPencere.setVisible(true);
            }
        });
    }
}
