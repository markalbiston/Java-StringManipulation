public class StringManipulator{
    public String trimAndConcat(String a, String b){
        // System.out.println(a.trim() + b.trim());
        return a.trim() + b.trim();
    }
    public Integer getIndexOrNull(String c, char d){
        int e = c.indexOf(d);
        if(e != -1){
            return e;
        }
        else{
            return null;
        }
    }
    public Integer getIndexOrNull(String f, String g){
        int h = f.indexOf(g);
        if(h != -1){
            return h;
        }
        else{
            return null;
        }
    }
    public String concatSubstring(String i, int j, int k, String l){
        String m = i.substring(j,k);
        String n = m.concat(l);
        return n;
    }
}
