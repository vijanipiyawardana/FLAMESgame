package flamesproject;

public class FLAMESProject {

    public static void main(String[] args) {

        String gfName = "theruni";
        String bfName = "dilum";

        StringBuilder gf = new StringBuilder(gfName);
        StringBuilder bf = new StringBuilder(bfName);

        System.out.println(gf);
        System.out.println(bf);

        for (int i = 0; i < gf.length(); i++) {
            for (int j = 0; j < bf.length(); j++) {
                if ((gf.charAt(i) != '@')) {
                    if (gf.charAt(i) == bf.charAt(j)) {

                        System.out.println(gf.charAt(i) + "-" + bf.charAt(j));
                        gf.setCharAt(i, '@');
                        bf.setCharAt(j, '@');
                    }
                }
            }

        }
        System.out.println(gf);
        System.out.println(bf);
        
        int count =0;
        for(int i=0; i< gf.length(); i++){
            if(gf.charAt(i) != '@')
                count++;
        }
        for(int i=0; i< bf.length(); i++){
            if(bf.charAt(i) != '@')
                count++;
        }
        System.out.println("count :" + count);
        
        StringBuffer flames = new StringBuffer("FLAMES");
        String s = new String();
        
        for(int i=0; i<5; i++){
            int n=-1, l = 0, p = 0;
            for(int j=1; j<=count; j++){
                n++;
                l++;
                if(n>flames.length()-1){
                    char e = flames.charAt(p);
                    if(l == count){
                        flames.deleteCharAt(p);
                        s = flames.substring(p, flames.length());
                        flames.delete(p, flames.length());
                        flames.insert(0, s);
                        break;            
                    }else{
                        p++;
                        if(p==flames.length()){
                            p =0;
                        }
                    }
                }else{
                    char e = flames.charAt(n);
                    if(l==count){
                        flames.deleteCharAt(n);
                        s = flames.substring(n, flames.length());
                        flames.delete(n, flames.length());
                        flames.insert(0, s);
                        break;
                    }
                }
            }
        }
        System.out.println("flames result :" +flames);
        char result = flames.charAt(0);
        switch(result){
            case 'F':
                System.out.println("Friends");
                break;
            case 'L':
                System.out.println("Love");
                break;
            case 'A':
                System.out.println("Affection");
                break;     
            case 'M':
                System.out.println("Marriage");
                break;
            case 'E':
                System.out.println("Enemy");
                break;
            case 'S':
                System.out.println("Sister");
                break;
        }
    }    
}
