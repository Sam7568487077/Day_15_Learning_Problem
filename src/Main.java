public class Main {
    public static void main(String[] args) {
        System.out.println("This is Hash table learning problem");
        String sentence = " paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situation ";
        MyHashMap map1 = new MyHashMap();
        map1.frequencyCalc(sentence);
    }
}