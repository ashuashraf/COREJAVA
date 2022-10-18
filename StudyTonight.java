public class StudyTonight {
    public static void main(String[] args) {
        String str="StudyTonight";
        System.out.println(str.indexOf('u'));   //3rd form
        System.out.println(str.indexOf('t', 2));    //2nd form
        String subString="Ton";
        System.out.println(str.indexOf(subString)); //1st form
        System.out.println(str.indexOf(subString,7));   //4th form
    }
}