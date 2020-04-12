import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	public static final double TOLERANCE = 0.000000001;
	
	@Test
	public void test1() {
		double[] temperatures = { -34.71, 11.1, 6.43, -29.51, -4.05, -566, 42, 103.22, 25.01, 22.80, 48.23,
				8.56, 2.28, 1.32, 15.11, -85.6, 262.49, 64.64, 112.40, -62.19, -29.04, 3.75, 196.32, 104.93,
				-116.61, 351.53, 145.89, -51.23, -74.15, -119.66, -147.81, -183.68, 324.85, 218.08, -54.69, 26.61,
				-175.43, -167.36, 209.21, -93.37, 3.02, 19.69, 308.81, 102.55, 274.65, 43.21, 235.59, 122.05, 195.09,
				120.43, -30.56, 140.67, 292.05, 54.76, 114.63, -99.33, 255.81, 300.35, -103.91, -153.94, 68.88, 41.07,
				-100.10, 70.36, 357.18, -115.66, -9.79, 206.10, 264.68, -193.10, 113.40, -144.08, 379.83, 244.88,
				300.32, 154.67, 55.07, 294.29, 257.90, -39.60, 2.75, 81.28, 322.33, 3.30, -78.84, -127.39, 364.42,
				-164.58, 203.86, -172.64, -88.02, 200.88, 313.48, 39.67, 46.02, 205.33, 158.11, -109.70, -174.73, 45.97,
				73.89, -88.78, -121.05, -139.95, -8.29, 372.68, 261.08, -98.56, -150.77, -173.73, -117.72, -118.50,
				-199.04, -119.67, 26.12, 291.29, 280.06, 345.44, 217.12, -181.68, 334.44, 168.12, 236.15, 385.55,
				-101.64, -130.17, 376.47, -126.15, 167.01, 126.16, -100.23, 41.09, 217.58, 257.61, -113.16, -77.77,
				264.35, -41.34, 280.64, 284.11, -151.31, -34.22, 92.72, 117.28, 246.44, -42.07, 284.45, -125.76,
				-174.10, -5.55, 145.02, 209.28, 2.87, 25.72, 66.58, 140.08, -124.49, 60.83, 264.46, 234.20, -89.80,
				244.30, 206.59, -174.00, 311.62, 380.51, 301.20, -9.50, -115.69, -50.34, 145.65, 240.00, 392.17, -16.84,
				361.61, 268.11, 186.13, 109.12, 333.02, 342.59, 318.99, 40.13, 223.41, -55.38, -170.62, 155.74, 77.56,
				-33.53, -184.56, -168.78, -189.79, 13.34, 124.98, 381.78, 50.56, 106.76, 165.19, 128.03, 146.50, -41.68,
				278.62, 143.75, -64.22, 171.86, -54.21, 121.11, 164.36, 240.84, 156.21, 281.09, -127.08, 34.49, 40.55,
				-31.52, -117.28, 212.59, 75.65, 301.20, 90.60, -126.97, 62.46, 192.55, 230.51, 120.05, 233.68, 232.79,
				-125.09, -57.21, 273.52, 103.10, 134.67, -184.85, 126.25, -99.85, 169.59, 167.18, -166.62, -26.55,
				44.08, 136.92, 271.15, 320.63, -145.93, 188.59, 360.53, -152.79, 210.65, -120.99, 291.32, -122.45,
				-104.70, 68.77, -60.04, 3.06, 198.45, 7.97, 167.65, 71.08, 319.9, 178.69, 60.6, -145.25, 2.24,
				-52.94, 219.64, 199.25, 300.44, 17.54, 116.72, 13.76, -173.76, 20.47, 322.69, -128.41, -191.40, 50.88,
				-144.69, 391.93, -195.65, 62.82, 220.52, 7.58, 220.27, 7.67, 305.71, -28.60, 133.01, 188.72, -58.69,
				122.46, 26, -173.92, -127.65, -180.73, -162.48, 387.26, 76.24, 152.51, 362.43, 287.94, -174.15,
				274.20, -16.74, 256.38, 28.94, 222.35, 134.26, -68.41, -24.44, 182.41, 372.58, -138.31, 294.40, 306.43,
				254.03, -16.92, 257.08, 210.34, 38.74, 94.96, -23.84, 87.26, 214.12, 395.47, 118.59, -188.58, 357.72,
				216.76, 100.04, 62.48, 366.21, 86.14, 339.31, 374.10, 149.22, 348.37, 33.30, 303.28, 327.83, 211.95,
				63.92, 228.74, -112.19, 27.59, 267.65, 16.52, 115.89, -128.00, -13.67, 340.51, -104.59, 293.52, 374.81,
				12.77, 353.35, 178.02, -33.40, 65.69, 3.12, 114.90, 2.05, 132.70, -155.02, 381.98, -85.58 };
		
		double expectedColdest = 6;
		double actualColdest = Temperature.coldest(temperatures);
		assertEquals(expectedColdest, actualColdest, TOLERANCE);
	}

}