
public class Statistician {
	
		private int count;
		private double sum;
		private double maximum;
		private double minimum;

		public Statistician()
		{
			count = 0;
		}

		public void addAll(Statistician addend)
		{
			if (addend.count != 0)
			{
				if (count == 0)
				{
					count = addend.count;
					sum = addend.sum;
					maximum = addend.maximum;
					minimum = addend.minimum;
				}
				else
				{
					count += addend.count;
					sum += addend.sum;
					if (addend.maximum > maximum)
						maximum = addend.maximum;
					if (addend.minimum < minimum)
						minimum = addend.minimum;
				}
			}
		}

		public void clear()
		{
			count = 0;
		}

		public boolean equals(Object obj)
		{
			if (obj instanceof Statistician)
			{
				Statistician stat = (Statistician) obj;
				return (stat.count == count && stat.sum == sum &&
					stat.maximum == maximum && stat.minimum == minimum);
			}
			return false;
		}

		public int length()
		{
			return count;
		}

		public double maximum()
		{
			if (count == 0)
				return Double.NaN;
			return maximum;
		}

		public double mean()
		{
			if (count == 0)
				return Double.NaN;
			return sum / count;
		}

		public double minimum()
		{
			if (count == 0)
				return Double.NaN;
			return minimum;
		}

		public void next(double number)
		{
			if (count == 0)
			{
				sum = number;
				maximum = number;
				
			}
			else
			{
				sum += number;
				if (number > maximum)
					maximum = number;
				if (number < minimum)
					minimum = number;
			}
			count++;
		}

		public double sum()
		{
			if (count == 0)
				return 0;
			return sum;
		}

		public static Statistician union(Statistician s1, Statistician s2)
		{
			if (s1 == null || s2 == null)
				throw new RuntimeException("union: null pointer exception");

			Statistician result = new Statistician();
			result.addAll(s1);
			result.addAll(s2);
			return result;
		}
	
}
