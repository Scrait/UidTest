public class Main {
    public static void main(String[] args) {
        String nick = "adolf_stalin_";
        String str = URLReader.readURL().toString();
        int pos;
        int posAfterNick;
        String uid;

        pos = str.indexOf(nick);
        posAfterNick = pos + 13;
        System.out.println(pos);
        uid = str.substring(posAfterNick, posAfterNick + 6);
        System.out.println(uid);

        System.out.println(uid.trim());
        //System.out.println(URLReader.readURL());



    }

}