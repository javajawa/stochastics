package networkssim.simulations;

import java.util.Random;
import networkssim.entropy.DiscreteProcess;
import networkssim.entropy.Distribution;
import networkssim.entropy.implementations.Bernoulli;
import networkssim.statistics.QueueStatistic;
import networkssim.statistics.TimedQueueSample;

public class SlottedAloha extends Thread
{
	private final DiscreteProcess arrivalProcess;
	private final Distribution<Integer> retransmissionProbability;
	private final Random r;

	private final long samples;
	private final TimedQueueSample s = new TimedQueueSample();

	private int curr = 0;

	public SlottedAloha(DiscreteProcess arrivalProcess,	Distribution<Integer> retransmissionProbability, long samples)
	{
		this(arrivalProcess, retransmissionProbability, samples, new Random());
	}

	public SlottedAloha(DiscreteProcess arrivalProcess,
		Distribution<Integer> retransmissionProbability, long samples,
		String name)
	{
		this(arrivalProcess, retransmissionProbability, samples, new Random(), name);
	}

	public SlottedAloha(DiscreteProcess arrivalProcess,
		Distribution<Integer> retransmissionProbability, long samples,
		ThreadGroup group)
	{
		this(arrivalProcess, retransmissionProbability, samples, new Random(), group);
	}

	public SlottedAloha(DiscreteProcess arrivalProcess,	Distribution<Integer> retransmissionProbability, long samples, Random r)
	{
		this(arrivalProcess, retransmissionProbability, samples, r, null, "Aloha-Thread");
	}

	public SlottedAloha(DiscreteProcess arrivalProcess,
		Distribution<Integer> retransmissionProbability, long samples, Random r,
		String name)
	{
		this(arrivalProcess, retransmissionProbability, samples, r, null, name);
	}

	public SlottedAloha(DiscreteProcess arrivalProcess,
		Distribution<Integer> retransmissionProbability, long samples, Random r,
		ThreadGroup group)
	{
		this(arrivalProcess, retransmissionProbability, samples, r, group, "Aloha-Thread");
	}

	public SlottedAloha(DiscreteProcess arrivalProcess,
		Distribution<Integer> retransmissionProbability, long samples, Random r,
		ThreadGroup group, String name)
	{
		super(group, name);
		this.arrivalProcess = arrivalProcess;
		this.retransmissionProbability = retransmissionProbability;
		this.samples = samples;
		this.r = r;
	}

	public QueueStatistic getBlockingStatistics()
	{
		return s.unmodifiableCopy();
	}

	@Override
	public void run()
	{
		long arrivals;
		long retransmissions;

		while (s.sampleCount() < samples)
		{
			arrivals = arrivalProcess.next();
			retransmissions = Bernoulli.sample(curr, retransmissionProbability.valueOf(curr), r);

			if (arrivals + retransmissions == 1)
			{
				if (retransmissions == 1){
					--curr;
					s.observed(0, 1);
				}
				else
				{
					s.observed(1, 1);
				}
			}
			else
			{
				curr += arrivals;
				s.observed((int)arrivals, 0);
			}
		}
	}

}
