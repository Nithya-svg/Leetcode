class Solution {
    public String reorganizeString(String s) {
        int[] freq = new int[26];
        int len= s.length();
        int max = 0;
        char maxchar=' ';
        for(int i=0; i < len;i++){
            int ind = s.charAt(i) - 'a';
            freq[ind]++;
            if(freq[ind] > max){
            max = freq[ind];
            maxchar = (char)(ind+'a');

        }
        }
    
    if(max > (len+1)/2){
        return "";
    }

    char ch[] = new char[len];
    int index = 0;
    while(freq[maxchar - 'a']>0){
        ch[index] = maxchar;
        index += 2;
        freq[maxchar-'a']--;
        
    }
    for(int i=0; i < 26;i++){
        while(freq[i] > 0){
            if(index >= len){
                index = 1;
            }

            ch[index] = (char)(i+'a');
            index += 2;
            freq[i]--;
        }
    }
    return new String(ch);
    }
}