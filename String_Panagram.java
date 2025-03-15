public class String_Panagram {
    public static boolean pan(String s) {boolean arr[]=new boolean[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
//         if(Character.isAlphabetic(ch)){
// ch =Character.toUpperCase(ch);
// if(arr[ch-'A']!=true){
//     arr[ch-'A']=true;
// }
//         }
if(ch>='a' && ch<='z'){
    arr[ch-'a']=true;
}
if(ch>='A'&&ch<='Z'){
    arr[ch-'A']=true;
}
else{
    continue;
}

    }
for(int i=0;i<arr.length;i++){
    if(arr[i]!=true){
        return false;
}

}
return true;
    }
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy  dog";
        System.out.println(pan(str));
    }
}
