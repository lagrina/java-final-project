package finalProject;

public enum NetworkBandwidth {
	MBPS_500(1999),
	MBPS_300(1499),
	MBPS_100(1299),
	MBPS_50(1199),
	MBPS_10(799);

	private double networkRate;

	NetworkBandwidth(double networkRate) {
		this.networkRate = networkRate;
	}

	public double getNetworkRate() {
		return networkRate;
	}
}
