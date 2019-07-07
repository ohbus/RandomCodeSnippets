BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String  lines = br.readLine();    

String[] strs = lines.trim().split("\\s+");

for (int i = 0; i < strs.length; i++) {
	a[i] = Integer.parseInt(strs[i]);
}




String[] arr=reader.readLine().split(" ");//take the input in string array separated by whitespaces" "
int[] intarr=new int[arr.length];
 
for(int i=0;i<arr.length;i++)
 intarr[i]=Integer.parseInt(arr[i]);//each array indices parsed to integer