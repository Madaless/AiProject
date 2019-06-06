package fullyconnectednetwork;

public class Network {
	
	private double[][][] weights;
	private double[][] output;
	private double bias[][];
	public final int[] NETWORK_LAYER_SIZES;
	public final int INPUT_SIZE;
	public final int OUTPUT_SIZE;
	public final int NETWORK_SIZE;
	
	
	
	Network(int ... NETWORK_LAYER_SIZES) {
		this.NETWORK_LAYER_SIZES = NETWORK_LAYER_SIZES;
		this.INPUT_SIZE = NETWORK_LAYER_SIZES[0];
		this.NETWORK_SIZE = NETWORK_LAYER_SIZES.length;
		this.OUTPUT_SIZE = NETWORK_LAYER_SIZES[NETWORK_SIZE-1];
		
		this.output = new double[NETWORK_SIZE][];
		this.weights = new double[NETWORK_SIZE][][];
		this.bias = new double[NETWORK_SIZE][];
		
		for(int i=0; i < NETWORK_SIZE; i++)
		{
			this.output[i] = new double[NETWORK_LAYER_SIZES[i]];
			this.bias[i] = new double[NETWORK_LAYER_SIZES[i]];
			
			if(i > 0)
				this.weights[i] = new double[NETWORK_LAYER_SIZES[i]][NETWORK_LAYER_SIZES[i]-1];


		}

	}
	
	public static void main() {
		 Network net = new Network(4,1,3,4);
		 
		
	}
}
