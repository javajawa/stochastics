package uk.co.harcourtprogramming.stochastics.statistics;

import java.util.Collection;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SampleValuesTest
{
	@Parameterized.Parameters
	public static Collection<Number[][]> data()
	{
		return Arrays.asList(new Number[][][] {
			new Number[][] {
				new Integer[] { 0, 0, 0, 0, 0, 0, 0, 0 },
				new Double[] { 0D, 0D, 0D, 0D, 0D, 0D, 0D, 0D },
				new Double[] { Double.POSITIVE_INFINITY, 0D, 0D, 0D, 0D, 0D, 0D, 0D }
			},
			new Number[][] {
				new Integer[] { 1, 1, 1, 1, 1, 1, 1, 1 },
				new Double[] { 1D, 1D, 1D, 1D, 1D, 1D, 1D, 1D },
				new Double[] { Double.POSITIVE_INFINITY, 0D, 0D, 0D, 0D, 0D, 0D, 0D }
			},
			new Number[][] {
				new Integer[] {166, 602, 263, 654, 689, 748, 451, 84, 229, 913},
				new Double[] {166D, 384D, 343.6667e+000, 421.2500e+000, 474.8000e+000, 520.3333e+000, 510.4286e+000, 457.1250e+000, 431.7778e+000, 479.9000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 95.0480e+003, 52.4043e+003, 59.0129e+003, 58.5977e+003, 59.3179e+003, 50.1183e+003, 65.6887e+003, 63.2599e+003, 79.3885e+003},
			},
			new Number[][] {
				new Integer[] {152, 826, 538, 996, 78, 443, 107, 962, 5, 775},
				new Double[] {152D, 489D, 505.3333e+000, 628D, 518D, 505.5000e+000, 448.5714e+000, 512.7500e+000, 456.3333e+000, 488.2000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 227.1380e+003, 114.3693e+003, 136.4347e+003, 162.8260e+003, 131.1983e+003, 132.0180e+003, 146.1094e+003, 156.4913e+003, 149.2582e+003},
			},
			new Number[][] {
				new Integer[] {817, 869, 84, 400, 260, 800, 431, 911, 182, 264},
				new Double[] {817D, 843D, 590D, 542.5000e+000, 486D, 538.3333e+000, 523D, 571.5000e+000, 528.2222e+000, 501.8000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 1.3520e+003, 192.7030e+003, 137.4937e+003, 119.0815e+003, 111.6979e+003, 94.7273e+003, 100.0129e+003, 104.3679e+003, 99.7528e+003},
			},
			new Number[][] {
				new Integer[] {146, 136, 869, 580, 550, 145, 853, 622, 351, 513},
				new Double[] {146D, 141D, 383.6667e+000, 432.7500e+000, 456.2000e+000, 404.3333e+000, 468.4286e+000, 487.6250e+000, 472.4444e+000, 476.5000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 50D, 176.6863e+003, 127.4276e+003, 98.3202e+003, 94.7971e+003, 107.7550e+003, 95.3094e+003, 85.4698e+003, 76.1376e+003},
			},
			new Number[][] {
				new Integer[] {402, 76, 240, 123, 184, 240, 417, 50, 903, 945},
				new Double[] {402D, 239D, 239.3333e+000, 210.2500e+000, 205D, 210.8333e+000, 240.2857e+000, 216.5000e+000, 292.7778e+000, 358D},
				new Double[] {Double.POSITIVE_INFINITY, 53.1380e+003, 26.5693e+003, 21.0963e+003, 15.9600e+003, 12.9722e+003, 16.8822e+003, 18.9966e+003, 68.9867e+003, 103.8609e+003},
			},
			new Number[][] {
				new Integer[] {491, 489, 338, 900, 369, 111, 780, 390, 242, 404},
				new Double[] {491D, 490D, 439.3333e+000, 554.5000e+000, 517.4000e+000, 449.6667e+000, 496.8571e+000, 483.5000e+000, 456.6667e+000, 451.4000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 2D, 7.7023e+003, 58.1883e+003, 50.5233e+003, 67.9455e+003, 72.2098e+003, 63.3214e+003, 61.8865e+003, 55.2876e+003},
			},
			new Number[][] {
				new Integer[] {96, 132, 942, 956, 575, 60, 235, 353, 821, 15},
				new Double[] {96D, 114D, 390D, 531.5000e+000, 540.2000e+000, 460.1667e+000, 428D, 418.6250e+000, 463.3333e+000, 418.5000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 648D, 228.8520e+003, 232.6570e+003, 174.8712e+003, 178.3290e+003, 155.8503e+003, 134.2891e+003, 135.4925e+003, 140.5381e+003},
			},
			new Number[][] {
				new Integer[] {43, 169, 649, 732, 648, 451, 547, 296, 745, 189},
				new Double[] {43D, 106D, 287D, 398.2500e+000, 448.2000e+000, 448.6667e+000, 462.7143e+000, 441.8750e+000, 475.5556e+000, 446.9000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 7.9380e+003, 102.2520e+003, 117.6743e+003, 100.7307e+003, 80.5859e+003, 68.5362e+003, 62.2196e+003, 64.6515e+003, 65.6794e+003},
			},
			new Number[][] {
				new Integer[] {687, 184, 368, 626, 780, 81, 929, 776, 487, 436},
				new Double[] {687D, 435.5000e+000, 413D, 466.2500e+000, 529D, 454.3333e+000, 522.1429e+000, 553.8750e+000, 546.4444e+000, 535.4000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 126.5045e+003, 64.7710e+003, 54.5229e+003, 60.5800e+003, 81.9147e+003, 100.4491e+003, 94.1547e+003, 82.8823e+003, 74.8929e+003},
			},
			new Number[][] {
				new Integer[] {447, 306, 509, 511, 818, 795, 644, 379, 812, 533},
				new Double[] {447D, 376.5000e+000, 420.6667e+000, 443.2500e+000, 518.2000e+000, 564.3333e+000, 575.7143e+000, 551.1250e+000, 580.1111e+000, 575.4000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 9.9405e+003, 10.8223e+003, 9.2549e+003, 35.0287e+003, 40.7927e+003, 34.9006e+003, 34.7518e+003, 37.9696e+003, 33.9727e+003},
			},
			new Number[][] {
				new Integer[] {351, 939, 876, 550, 622, 587, 208, 301, 471, 230},
				new Double[] {351D, 645D, 722D, 679D, 667.6000e+000, 654.1667e+000, 590.4286e+000, 554.2500e+000, 545D, 513.5000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 172.8720e+003, 104.2230e+003, 76.8780e+003, 58.3083e+003, 47.7294e+003, 68.2123e+003, 68.9388e+003, 61.0915e+003, 64.2261e+003},
			},
			new Number[][] {
				new Integer[] {844, 195, 226, 171, 228, 436, 311, 923, 430, 185},
				new Double[] {844D, 519.5000e+000, 421.6667e+000, 359D, 332.8000e+000, 350D, 344.4286e+000, 416.7500e+000, 418.2222e+000, 394.9000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 210.6005e+003, 134.0143e+003, 105.0513e+003, 82.2207e+003, 67.5516e+003, 56.5103e+003, 90.2805e+003, 79.0149e+003, 75.6748e+003},
			},
			new Number[][] {
				new Integer[] {905, 980, 439, 111, 258, 409, 595, 262, 603, 711},
				new Double[] {905D, 942.5000e+000, 774.6667e+000, 608.7500e+000, 538.6000e+000, 517D, 528.1429e+000, 494.8750e+000, 506.8889e+000, 527.3000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 2.8125e+003, 85.9103e+003, 167.3869e+003, 150.1453e+003, 122.9156e+003, 103.2988e+003, 97.3958e+003, 86.5204e+003, 81.0731e+003},
			},
			new Number[][] {
				new Integer[] {222, 117, 297, 319, 424, 508, 86, 262, 801, 29},
				new Double[] {222D, 169.5000e+000, 212D, 238.7500e+000, 275.8000e+000, 314.5000e+000, 281.8571e+000, 279.3750e+000, 337.3333e+000, 306.5000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 5.5125e+003, 8.1750e+003, 8.3123e+003, 13.0977e+003, 19.4643e+003, 23.6791e+003, 20.3457e+003, 48.0350e+003, 52.2047e+003},
			},
			new Number[][] {
				new Integer[] {929, 730, 489, 579, 237, 459, 963, 547, 521, 232},
				new Double[] {929D, 829.5000e+000, 716D, 681.7500e+000, 592.8000e+000, 570.5000e+000, 626.5714e+000, 616.6250e+000, 606D, 568.6000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 19.8005e+003, 48.5470e+003, 37.0569e+003, 67.3532e+003, 56.8663e+003, 69.3966e+003, 60.2743e+003, 53.7560e+003, 61.7707e+003},
			},
			new Number[][] {
				new Integer[] {489, 624, 679, 396, 367, 988, 38, 885, 913, 796},
				new Double[] {489D, 556.5000e+000, 597.3333e+000, 547D, 511D, 590.5000e+000, 511.5714e+000, 558.2500e+000, 597.6667e+000, 617.5000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 9.1125e+003, 9.5583e+003, 16.5060e+003, 18.8595e+003, 53.0091e+003, 87.7823e+003, 92.6731e+003, 95.0720e+003, 88.4421e+003},
			},
			new Number[][] {
				new Integer[] {99, 262, 335, 680, 137, 721, 107, 654, 494, 779},
				new Double[] {99D, 180.5000e+000, 232D, 344D, 302.6000e+000, 372.3333e+000, 334.4286e+000, 374.3750e+000, 387.6667e+000, 426.8000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 13.2845e+003, 14.5990e+003, 59.9087e+003, 53.5013e+003, 71.9775e+003, 70.0386e+003, 72.7988e+003, 65.2890e+003, 73.3488e+003},
			},
			new Number[][] {
				new Integer[] {715, 904, 891, 334, 699, 198, 31, 744, 500, 480},
				new Double[] {715D, 809.5000e+000, 836.6667e+000, 711D, 708.6000e+000, 623.5000e+000, 538.8571e+000, 564.5000e+000, 557.3333e+000, 549.6000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 17.8605e+003, 11.1443e+003, 70.5980e+003, 52.9773e+003, 85.8339e+003, 121.6791e+003, 109.5569e+003, 96.3245e+003, 86.2198e+003},
			},
			new Number[][] {
				new Integer[] {905, 610, 618, 859, 805, 577, 183, 240, 887, 29},
				new Double[] {905D, 757.5000e+000, 711D, 748D, 759.4000e+000, 729D, 651D, 599.6250e+000, 631.5556e+000, 571.3000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 43.5125e+003, 28.2430e+003, 24.3047e+003, 18.8783e+003, 20.6476e+003, 59.7943e+003, 72.3674e+003, 72.4975e+003, 100.7496e+003},
			},
			new Number[][] {
				new Integer[] {490, 168, 979, 713, 500, 471, 60, 682, 42, 71},
				new Double[] {490D, 329D, 545.6667e+000, 587.5000e+000, 570D, 553.5000e+000, 483D, 507.8750e+000, 456.1111e+000, 417.6000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 51.8420e+003, 166.7543e+003, 118.1697e+003, 90.1585e+003, 73.7603e+003, 96.2587e+003, 87.4576e+003, 100.6409e+003, 104.2896e+003},
			},
			new Number[][] {
				new Integer[] {522, 97, 818, 818, 722, 150, 660, 519, 973, 649},
				new Double[] {522D, 309.5000e+000, 479D, 563.7500e+000, 595.4000e+000, 521.1667e+000, 541D, 538.2500e+000, 586.5556e+000, 592.8000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 90.3125e+003, 131.3470e+003, 116.2949e+003, 92.2298e+003, 106.8474e+003, 91.7930e+003, 78.7402e+003, 89.8985e+003, 80.2997e+003},
			},
			new Number[][] {
				new Integer[] {800, 454, 432, 825, 83, 133, 173, 391, 831, 803},
				new Double[] {800D, 627D, 562D, 627.7500e+000, 518.8000e+000, 454.5000e+000, 414.2857e+000, 411.3750e+000, 458D, 492.5000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 59.8580e+003, 42.6040e+003, 45.6949e+003, 93.6217e+003, 99.7043e+003, 94.4072e+003, 80.9883e+003, 90.4297e+003, 92.2845e+003},
			},
			new Number[][] {
				new Integer[] {60, 399, 527, 417, 657, 628, 292, 432, 15, 984},
				new Double[] {60D, 229.5000e+000, 328.6667e+000, 350.7500e+000, 412D, 448D, 425.7143e+000, 426.5000e+000, 380.7778e+000, 441.1000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 57.4605e+003, 58.2323e+003, 40.7723e+003, 49.3370e+003, 47.2456e+003, 42.8479e+003, 36.7317e+003, 50.9549e+003, 81.6810e+003},
			},
			new Number[][] {
				new Integer[] {167, 106, 372, 198, 490, 339, 952, 920, 53, 738},
				new Double[] {167D, 136.5000e+000, 215D, 210.7500e+000, 266.6000e+000, 278.6667e+000, 374.8571e+000, 443D, 399.6667e+000, 433.5000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 1.8605e+003, 19.4170e+003, 13.0169e+003, 25.3588e+003, 21.1607e+003, 82.4021e+003, 107.7780e+003, 111.2057e+003, 110.2965e+003},
			},
			new Number[][] {
				new Integer[] {269, 423, 548, 943, 418, 983, 301, 701, 666, 539},
				new Double[] {269D, 346D, 413.3333e+000, 545.7500e+000, 520.2000e+000, 597.3333e+000, 555D, 573.2500e+000, 583.5556e+000, 579.1000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 11.8580e+003, 19.5303e+003, 83.1569e+003, 65.6317e+003, 88.2027e+003, 86.0470e+003, 76.4191e+003, 67.8225e+003, 60.4852e+003},
			},
			new Number[][] {
				new Integer[] {698, 667, 178, 128, 999, 171, 33, 561, 882, 669},
				new Double[] {698D, 682.5000e+000, 514.3333e+000, 417.7500e+000, 534D, 473.5000e+000, 410.5714e+000, 429.3750e+000, 479.6667e+000, 498.6000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 480.5000e+000, 85.0803e+003, 94.0336e+003, 138.0955e+003, 132.4379e+003, 138.0850e+003, 121.1871e+003, 128.8020e+003, 118.0754e+003},
			},
			new Number[][] {
				new Integer[] {190, 369, 461, 982, 156, 856, 645, 376, 191, 428},
				new Double[] {190D, 279.5000e+000, 340D, 500.5000e+000, 431.6000e+000, 502.3333e+000, 522.7143e+000, 504.3750e+000, 469.5556e+000, 465.4000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 16.0205e+003, 18.9910e+003, 115.7017e+003, 110.5123e+003, 118.4291e+003, 101.5986e+003, 89.7751e+003, 89.4648e+003, 79.6969e+003},
			},
			new Number[][] {
				new Integer[] {482, 121, 590, 226, 385, 583, 252, 290, 617, 265},
				new Double[] {482D, 301.5000e+000, 397.6667e+000, 354.7500e+000, 360.8000e+000, 397.8333e+000, 377D, 366.1250e+000, 394D, 381.1000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 65.1605e+003, 60.3243e+003, 47.5836e+003, 35.8707e+003, 36.9254e+003, 33.8093e+003, 29.9256e+003, 33.1780e+003, 31.1557e+003},
			},
			new Number[][] {
				new Integer[] {824, 983, 730, 344, 584, 108, 906, 880, 818, 261},
				new Double[] {824D, 903.5000e+000, 845.6667e+000, 720.2500e+000, 693D, 595.5000e+000, 639.8571e+000, 669.8750e+000, 686.3333e+000, 643.8000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 12.6405e+003, 16.3543e+003, 73.8203e+003, 59.0780e+003, 104.2999e+003, 100.6895e+003, 93.5138e+003, 84.2625e+003, 92.9908e+003},
			},
			new Number[][] {
				new Integer[] {594, 23, 425, 313, 161, 179, 423, 94, 599, 471},
				new Double[] {594D, 308.5000e+000, 347.3333e+000, 338.7500e+000, 303.2000e+000, 282.5000e+000, 302.5714e+000, 276.5000e+000, 312.3333e+000, 328.2000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 163.0205e+003, 86.0343e+003, 57.6509e+003, 49.5572e+003, 42.2167e+003, 38.0006e+003, 38.0097e+003, 44.8148e+003, 42.3528e+003},
			},
			new Number[][] {
				new Integer[] {696, 700, 639, 34, 69, 320, 531, 654, 408, 820},
				new Double[] {696D, 698D, 678.3333e+000, 517.2500e+000, 427.6000e+000, 409.6667e+000, 427D, 455.3750e+000, 450.1111e+000, 487.1000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 8D, 1.1643e+003, 104.5676e+003, 118.6113e+003, 96.8187e+003, 82.7853e+003, 77.4000e+003, 67.9744e+003, 74.1034e+003},
			},
			new Number[][] {
				new Integer[] {718, 969, 531, 325, 106, 611, 779, 423, 91, 266},
				new Double[] {718D, 843.5000e+000, 739.3333e+000, 635.7500e+000, 529.8000e+000, 543.3333e+000, 577D, 557.7500e+000, 505.8889e+000, 481.9000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 31.5005e+003, 48.3023e+003, 75.1196e+003, 112.4667e+003, 91.0723e+003, 83.8277e+003, 74.8168e+003, 89.6709e+003, 85.4621e+003},
			},
			new Number[][] {
				new Integer[] {154, 281, 440, 527, 457, 875, 518, 944, 638, 958},
				new Double[] {154D, 217.5000e+000, 291.6667e+000, 350.5000e+000, 371.8000e+000, 455.6667e+000, 464.5714e+000, 524.5000e+000, 537.1111e+000, 579.2000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 8.0645e+003, 20.5343e+003, 27.5350e+003, 22.9197e+003, 60.5375e+003, 51.0030e+003, 72.4483e+003, 64.8236e+003, 75.3357e+003},
			},
			new Number[][] {
				new Integer[] {241, 676, 289, 672, 695, 68, 255, 224, 668, 844},
				new Double[] {241D, 458.5000e+000, 402D, 469.5000e+000, 514.6000e+000, 440.1667e+000, 413.7143e+000, 390D, 420.8889e+000, 463.2000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 94.6125e+003, 56.8830e+003, 56.1470e+003, 52.2803e+003, 75.0662e+003, 67.4532e+003, 62.3160e+003, 63.1136e+003, 74.0033e+003},
			},
			new Number[][] {
				new Integer[] {344, 781, 675, 7, 602, 387, 916, 1, 462, 424},
				new Double[] {344D, 562.5000e+000, 600D, 451.7500e+000, 481.8000e+000, 466D, 530.2857e+000, 464.1250e+000, 463.8889e+000, 459.9000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 95.4845e+003, 51.9610e+003, 122.5529e+003, 96.4297e+003, 78.6416e+003, 94.4632e+003, 115.9864e+003, 101.4886e+003, 90.3712e+003},
			},
			new Number[][] {
				new Integer[] {461, 770, 322, 785, 471, 36, 176, 722, 473, 153},
				new Double[] {461D, 615.5000e+000, 517.6667e+000, 584.5000e+000, 561.8000e+000, 474.1667e+000, 431.5714e+000, 467.8750e+000, 468.4444e+000, 436.9000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 47.7405e+003, 52.5843e+003, 52.9230e+003, 42.2687e+003, 79.8926e+003, 79.2776e+003, 78.4958e+003, 68.6868e+003, 71.0054e+003},
			},
			new Number[][] {
				new Integer[] {341, 607, 192, 738, 243, 917, 269, 766, 189, 287},
				new Double[] {341D, 474D, 380D, 469.5000e+000, 424.2000e+000, 506.3333e+000, 472.4286e+000, 509.1250e+000, 473.5556e+000, 454.9000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 35.3780e+003, 44.1970e+003, 61.5057e+003, 56.3897e+003, 85.5871e+003, 79.3693e+003, 78.8038e+003, 80.3400e+003, 74.8937e+003},
			},
			new Number[][] {
				new Integer[] {91, 576, 683, 547, 426, 644, 648, 679, 636, 945},
				new Double[] {91D, 333.5000e+000, 450D, 474.2500e+000, 464.6000e+000, 494.5000e+000, 516.4286e+000, 536.7500e+000, 547.7778e+000, 587.5000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 117.6125e+003, 99.5230e+003, 68.7009e+003, 51.9913e+003, 46.9571e+003, 42.4970e+003, 39.7296e+003, 35.8579e+003, 47.6523e+003},
			},
			new Number[][] {
				new Integer[] {209, 709, 236, 119, 607, 450, 459, 662, 770, 350},
				new Double[] {209D, 459D, 384.6667e+000, 318.2500e+000, 376D, 388.3333e+000, 398.4286e+000, 431.3750e+000, 469D, 457.1000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 125.0000e+003, 79.0763e+003, 70.3623e+003, 69.4470e+003, 56.4703e+003, 47.7720e+003, 49.6311e+003, 56.1680e+003, 51.3432e+003},
			},
			new Number[][] {
				new Integer[] {662, 416, 842, 833, 256, 613, 582, 541, 870, 265},
				new Double[] {662D, 539D, 640D, 688.2500e+000, 601.8000e+000, 603.6667e+000, 600.5714e+000, 593.1250e+000, 623.8889e+000, 588D},
				new Double[] {Double.POSITIVE_INFINITY, 30.2580e+003, 45.7320e+003, 39.8002e+003, 67.2182e+003, 53.7955e+003, 44.8966e+003, 38.9264e+003, 42.5784e+003, 50.7276e+003},
			},
			new Number[][] {
				new Integer[] {318, 119, 940, 646, 479, 639, 545, 647, 544, 721},
				new Double[] {318D, 218.5000e+000, 459D, 505.7500e+000, 500.4000e+000, 523.5000e+000, 526.5714e+000, 541.6250e+000, 541.8889e+000, 559.8000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 19.8005e+003, 183.4210e+003, 131.0229e+003, 98.4103e+003, 81.9299e+003, 68.3410e+003, 60.3908e+003, 52.8426e+003, 50.1793e+003},
			},
			new Number[][] {
				new Integer[] {522, 994, 219, 106, 110, 64, 405, 448, 366, 764},
				new Double[] {522D, 758D, 578.3333e+000, 460.2500e+000, 390.2000e+000, 335.8333e+000, 345.7143e+000, 358.5000e+000, 359.3333e+000, 399.8000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 111.3920e+003, 152.5363e+003, 157.4656e+003, 142.6342e+003, 131.8418e+003, 110.5516e+003, 96.0663e+003, 84.0643e+003, 91.0993e+003},
			},
			new Number[][] {
				new Integer[] {628, 772, 933, 973, 192, 139, 696, 94, 525, 530},
				new Double[] {628D, 700D, 777.6667e+000, 826.5000e+000, 699.6000e+000, 606.1667e+000, 619D, 553.3750e+000, 550.2222e+000, 548.2000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 10.3680e+003, 23.2803e+003, 25.0590e+003, 99.3123e+003, 131.8286e+003, 111.0100e+003, 129.6046e+003, 113.4934e+003, 100.9240e+003},
			},
			new Number[][] {
				new Integer[] {861, 485, 393, 671, 741, 520, 348, 150, 586, 262},
				new Double[] {861D, 673D, 579.6667e+000, 602.5000e+000, 630.2000e+000, 611.8333e+000, 574.1429e+000, 521.1250e+000, 528.3333e+000, 501.7000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 70.6880e+003, 61.4773e+003, 43.0703e+003, 36.1392e+003, 30.9354e+003, 35.7235e+003, 53.1073e+003, 46.9365e+003, 48.8147e+003},
			},
			new Number[][] {
				new Integer[] {44, 755, 243, 442, 688, 359, 736, 395, 683, 704},
				new Double[] {44D, 399.5000e+000, 347.3333e+000, 371D, 434.4000e+000, 421.8333e+000, 466.7143e+000, 457.7500e+000, 482.7778e+000, 504.9000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 252.7605e+003, 134.5443e+003, 91.9367e+003, 89.0503e+003, 72.1878e+003, 74.2566e+003, 64.2914e+003, 61.8924e+003, 59.9094e+003},
			},
			new Number[][] {
				new Integer[] {442, 20, 331, 424, 270, 197, 822, 430, 888, 391},
				new Double[] {442D, 231D, 264.3333e+000, 304.2500e+000, 297.4000e+000, 280.6667e+000, 358D, 367D, 424.8889e+000, 421.5000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 89.0420e+003, 47.8543e+003, 38.2762e+003, 28.9418e+003, 24.8335e+003, 62.5577e+003, 54.2689e+003, 77.6454e+003, 69.1329e+003},
			},
			new Number[][] {
				new Integer[] {769, 397, 809, 755, 377, 216, 790, 949, 328, 671},
				new Double[] {769D, 583D, 658.3333e+000, 682.5000e+000, 621.4000e+000, 553.8333e+000, 587.5714e+000, 632.7500e+000, 598.8889e+000, 606.1000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 69.1920e+003, 51.6213e+003, 36.7503e+003, 46.2288e+003, 64.3746e+003, 61.6133e+003, 69.1402e+003, 70.8169e+003, 63.4683e+003},
			},
			new Number[][] {
				new Integer[] {439, 834, 769, 167, 862, 990, 514, 884, 588, 155},
				new Double[] {439D, 636.5000e+000, 680.6667e+000, 552.2500e+000, 614.2000e+000, 676.8333e+000, 653.5714e+000, 682.3750e+000, 671.8889e+000, 620.2000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 78.0125e+003, 44.8583e+003, 95.8689e+003, 91.0907e+003, 96.4102e+003, 84.1296e+003, 78.7483e+003, 69.8944e+003, 88.8457e+003},
			},
			new Number[][] {
				new Integer[] {200, 407, 749, 826, 790, 319, 534, 90, 112, 136},
				new Double[] {200D, 303.5000e+000, 452D, 545.5000e+000, 594.4000e+000, 548.5000e+000, 546.4286e+000, 489.3750e+000, 447.4444e+000, 416.3000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 21.4245e+003, 76.8690e+003, 86.2150e+003, 76.6173e+003, 73.9347e+003, 61.6423e+003, 78.8771e+003, 84.8410e+003, 85.1140e+003},
			},
			new Number[][] {
				new Integer[] {679, 495, 190, 495, 148, 55, 851, 561, 930, 697},
				new Double[] {679D, 587D, 454.6667e+000, 464.7500e+000, 401.4000e+000, 343.6667e+000, 416.1429e+000, 434.2500e+000, 489.3333e+000, 510.1000e+000},
				new Double[] {Double.POSITIVE_INFINITY, 16.9280e+003, 61.0003e+003, 41.0736e+003, 50.8713e+003, 60.6959e+003, 87.3495e+003, 77.4939e+003, 95.1148e+003, 88.8590e+003},
			}
		});
	}

	private final Integer[] values;
	private final Double[] means;
	private final Double[] variances;

	public SampleValuesTest(Integer[] values, Double[] means, Double[] variances)
	{
		if (means.length != values.length) throw new IllegalArgumentException("Wrong number of means.");
		if (variances.length != values.length) throw new IllegalArgumentException("Wrong number of variances.");

		this.values = values;
		this.means = means;
		this.variances = variances;
	}

	@Test
	public void TestSamplingValues()
	{
		Sample s = new Sample();
		for (int i = 0; i < values.length; ++i)
		{
			s.observed(values[i]);
			assertEquals("Mean", means[i], s.sampleMean(), 0.01);
			if (variances[i] == Double.POSITIVE_INFINITY)
				assertEquals("Variance", variances[i], s.sampleVariance(), 0.055);
			else
				assertEquals("Variance", variances[i], s.sampleVariance() * (i+1)/i, 0.055);
		}
	}
}
