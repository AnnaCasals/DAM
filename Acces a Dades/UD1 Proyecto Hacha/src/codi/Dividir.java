package codi;
import java.io.*;
public class Dividir {
	 public static void main(String[] args) throws FileNotFoundException, IOException {
		 RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Anna\\Desktop\\arxiu.txt", "r");
		 long numSplits = 3; //from user input, extract it from args
		 long sourceSize = raf.length();
		 long bytesPerSplit = sourceSize/numSplits ;
		 long remainingBytes = sourceSize % numSplits;
		 int maxReadBufferSize = 8 * 1024; //8KB
				
		 for(int destIx=1; destIx <= numSplits; destIx++) {
			 BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("C:\\Users\\alumno\\Desktop\\Parte."+destIx+".txt"));
			 if(bytesPerSplit > maxReadBufferSize) {
				 long numReads = bytesPerSplit/maxReadBufferSize;
				 long numRemainingRead = bytesPerSplit % maxReadBufferSize;
				 for(int i=0; i<numReads; i++) {
					 readWrite(raf, bw, maxReadBufferSize);
				 }
				 if(numRemainingRead > 0) {
					 readWrite(raf, bw, numRemainingRead);
				 }
			 } else {
				 readWrite(raf, bw, bytesPerSplit);
			 }
			 bw.close();
		 }
		 if(remainingBytes > 0) {
			 BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("C:\\Users\\alumno\\Desktop\\Parte."+(numSplits+1) + ".txt"));
			 readWrite(raf, bw, remainingBytes);
			 bw.close();
		 }
		 raf.close();
	 }

	 static void readWrite(RandomAccessFile raf, BufferedOutputStream bw, long numBytes) throws IOException {
		 byte[] buf = new byte[(int) numBytes];
		 int val = raf.read(buf);
		 if(val != -1) {
			 bw.write(buf);
		 }
	 }
}
