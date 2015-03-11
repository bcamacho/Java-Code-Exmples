class Matrix {
	public static void main(String[] args) {
		//Alphabet
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		// Create a 2x13 matrix
		String[][] matrix = new String[2][13];
		int dataCount=0;
		//insert data
		for (int i=0;i<matrix.length;i++){
				for (int j=0;j<matrix[i].length;j++){
					matrix[i][j] = String.valueOf(alphabet[dataCount++]);
					System.out.println(matrix[i][j]);
				}
		}
	}
}