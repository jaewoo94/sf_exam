package com.jaewoo.exam.tv;

public class Tv {

		protected int channel;
		protected int volume;
		
		Tv() {}
		
		Tv(int channel, int volume)
		{
			setChannel(channel);
			setVolume(volume);
		}
		
		
		public int getChannel() {
			return channel;
		}

		public void setChannel(int channel) {
			
			if(channel < 1)
			{
				this.channel = 1;
			}
			else if(channel > 300)
			{
				this.channel = 300;
			}
			else
			{
				this.channel = channel;
			}		
		}

		public int getVolume() {
			return volume;
		}

		public void setVolume(int volume) {
			
			if(volume < 1)
			{
				this.volume = 1;
			}
			else if(volume > 20)
			{
				this.volume = 20;
			}
			else
			{
				this.volume = volume;
			}		
		}

		void showState()
		{
			System.out.printf("channel : %d, volume: %d\n", channel,volume);
		}
		
		void channelUp()
		{
			channel++;
		}
		
		void channelDown()
		{
			channel--;
		}
		
		void volumeUp()
		{
			volume++;
		}
		
		void volumeDown()
		{
			volume--;
		}
}

