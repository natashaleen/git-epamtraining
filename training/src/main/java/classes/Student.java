package classes;
import java.util.Date;

public class Student {

    public int id;
    public String surname;
    public String name;
    public String otchestvo;
    public Date data_rojdeniya;
    public String adres;
    public int telefon;
    public String fakultet;
    public int kurs;
    public String gruppa;

    public Student() {
    }
    public Student(int id, String surname, String name, String otchestvo, Date data_rojdeniya, String adres, int telefon, String fakultet, int kurs, String gruppa) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.otchestvo = otchestvo;
        this.data_rojdeniya = data_rojdeniya;
        this.adres = adres;
        this.telefon = telefon;
        this.fakultet = fakultet;
        this.kurs = kurs;
        this.gruppa = gruppa;
    }

    public String getAdres() {
        return adres;
    }
    public Date getData_rojdeniya() {
        return data_rojdeniya;
    }
    public String getFakultet() {
        return fakultet;
    }
    public String getGruppa() {
        return gruppa;
    }
    public int getId() {
        return id;
    }
    public int getKurs() {
        return kurs;
    }
    public String getName() {
        return name;
    }
    public String getOtchestvo() {
        return otchestvo;
    }
    public String getSurname() {
        return surname;
    }
    public int getTelefon() {
        return telefon;
    }
    public void setAdres(String adres) {
        this.adres = adres;
    }
    public void setData_rojdeniya(Date data_rojdeniya) {
        this.data_rojdeniya = new Date(1995, 1, 1);
    }
    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }
    public void setGruppa(String gruppa) {
        this.gruppa = gruppa;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setKurs(int kurs) {
        this.kurs = kurs;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOtchestva(String otchestva) {
        this.otchestvo = otchestvo;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
    public void show() {
        System.out.println("id: " + getId());
        System.out.println("Familya: " + getSurname());
        System.out.println("Imya: " + getName());
        System.out.println("Otchestvo: " + getOtchestvo());
        System.out.println("data rojdeniya: " + getData_rojdeniya().getYear()+"."+getData_rojdeniya().getMonth()+"."+getData_rojdeniya().getDay());
        System.out.println("adres: " + getAdres());
        System.out.println("telefon: " + getTelefon());
        System.out.println("fakultet: " + getFakultet());
        System.out.println("kurs: " + getKurs());
        System.out.println("gruppa: " + getGruppa());
        System.out.println(" ");
    }
    //список студентов заданного факультета
    public void fakultet() {
        if ((this.getFakultet()).equals("Физический")) {
            System.out.println("id: " + getId());
            System.out.println("Familya: " + getSurname());
            System.out.println("Imya: " + getName());
            System.out.println("Otchestvo: " + getOtchestvo());
            System.out.println("data rojdeniya: " + getData_rojdeniya().getYear() + "." + getData_rojdeniya().getMonth() + "." + getData_rojdeniya().getDay());
            System.out.println("adres: " + getAdres());
            System.out.println("telefon: " + getTelefon());
            System.out.println("fakultet: " + getFakultet());
            System.out.println("kurs: " + getKurs());
            System.out.println("gruppa: " + getGruppa());
            System.out.println(" ");

        }
    }
    //списки студентов для факультета и курса
    public void fakkurs() {

        if (((this.getFakultet()).equals("Бизнес и право")) && (this.getKurs() == 3)) {
            System.out.println("id: " + getId());
            System.out.println("Familya: " + getSurname());
            System.out.println("Imya: " + getName());
            System.out.println("Otchestvo: " + getOtchestvo());
            System.out.println("data rojdeniya: " + getData_rojdeniya().getYear()+"."+getData_rojdeniya().getMonth()+"."+getData_rojdeniya().getDay());
            System.out.println("adres: " + getAdres());
            System.out.println("telefon: " + getTelefon());
            System.out.println("fakultet: " + getFakultet());
            System.out.println("kurs: " + getKurs());
            System.out.println("gruppa: " + getGruppa());
            System.out.println(" ");
        }
    }
    //список студентов, родившихся после заданного года
    public void date_roj(Date p){
        if ((this.getData_rojdeniya().getYear()) > (p.getYear())){
            System.out.println("id: " + getId());
            System.out.println("Familya: " + getSurname());
            System.out.println("Imya: " + getName());
            System.out.println("Otchestvo: " + getOtchestvo());
            System.out.println("data rojdeniya: " + getData_rojdeniya().getYear());
            System.out.println("adres: " + getAdres());
            System.out.println("telefon: " + getTelefon());
            System.out.println("fakultet: " + getFakultet());
            System.out.println("kurs: " + getKurs());
            System.out.println("gruppa: " + getGruppa());
            System.out.println(" ");
        }
    }
    // список учебной группы
    public void groupp(){
        if (this.getGruppa().equals("10155119")){
            System.out.println("id: " + getId());
            System.out.println("Familya: " + getSurname());
            System.out.println("Imya: " + getName());
            System.out.println("Otchestvo: " + getOtchestvo());
            System.out.println("data rojdeniya: " + getData_rojdeniya().getYear());
            System.out.println("adres: " + getAdres());
            System.out.println("telefon: " + getTelefon());
            System.out.println("fakultet: " + getFakultet());
            System.out.println("kurs: " + getKurs());
            System.out.println("gruppa: " + getGruppa());
            System.out.println(" ");
        }
    }

}
