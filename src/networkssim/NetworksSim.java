/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package networkssim;

/**
 *
 * @author Benedict
 */
public class NetworksSim
{
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{

		for (int n : new int[] {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 4096, 32786})
			for (double p : new double[] {0.01, 0.05, 0.1, 0.25, 0.33, 0.5, 0.67, 0.75, 0.9, 0.95, 0.99})
				System.out.format("new Number[] {%1$6d, %2$6.3fD},\n", n, p);

	}
}
