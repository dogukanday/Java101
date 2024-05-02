package Week2.StudentInformationSystem;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat,int matVerbal, int fizik,int fzkVerbal, int kimya , int kimyaVerbal) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if (matVerbal >= 0 && matVerbal <= 100) {
            this.mat.verbalNote = matVerbal;
        }

        if (fzkVerbal >= 0 && fzkVerbal <= 100) {
            this.fizik.verbalNote = fzkVerbal;
        }

        if (kimyaVerbal >= 0 && kimyaVerbal <= 100) {
            this.kimya.verbalNote = kimyaVerbal;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.verbalNote == 0 || this.fizik.verbalNote == 0 || this.kimya.verbalNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        //this.avarage = ((this.fizik.note + this.kimya.note + this.mat.note) * 0.8) + ((this.fizik.verbalNote + this.kimya.verbalNote + this.mat.verbalNote) * 0.2) / 6;
        int notes = this.fizik.note + this.kimya.note + this.mat.note;
        int verbalNotes = this.fizik.verbalNote + this.kimya.verbalNote + this.mat.verbalNote;
        double aver = (notes * 0.8) + (verbalNotes * 0.2);
        this.avarage = aver / 6;

    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Matematik Sozlu Notu : " + this.mat.verbalNote);
        System.out.println("Fizik Sozlu Notu : " + this.fizik.verbalNote);
        System.out.println("Kimya Sozlu Notu : " + this.kimya.verbalNote);
    }
}
