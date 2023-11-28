public static class APStringExtension{
    public static int charAtButAPInt(String text, int pos){
        for(int i = 0; i < 256; i++) if(text.substring(pos, pos + 1).compareTo(Character.toString((char)i)) == 0) return i;
        return -1;
    }
    public static char charAtButAPChar(String text, int pos){
        for(int i = 0; i < 256; i++) if(text.substring(pos, pos + 1).compareTo(Character.toString((char)i)) == 0) return (char)i;
        return ' ';
    }
}
