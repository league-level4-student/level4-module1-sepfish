package _05_Enum_Stuff;

import java.net.URI;
import java.util.Random;

import javax.swing.JOptionPane;
import _04_Intro_To_Enums.Zodiac;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.

	// 3. Make a main method to test your method

	public static void horoquote(Zodiac z) {
		switch (z) {
		case AQUARIUS: {
			JOptionPane.showMessageDialog(null,
					"AQUARIUS\nSep 20, 2019\nStress could have you feeling a little out of sorts by the end of the day, Aquarius.\nYou might have been considering going out for the evening, but it might be better if you put off those plans and stay home and rest.\nTake a walk to a takeout place and get some dinner, then relax with a funny video.\nThis way you'll able to release all the tension and sleep soundly.");
			try {
				URI uri = new URI("https://www.bgreco.net/hsquote/?source=eridan");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		case PISCES: {
			JOptionPane.showMessageDialog(null,
					"PICES\nSep 20, 2019\nHave you recently purchased something you wanted that's more of a luxury than a necessity?\nToday you might feel guilty about it.\nIt may have temporarily strained your budget.\nDon't even think about taking it back!\nSometimes luxury items can lift the spirits.\nPayday will be around again before you know it.");
			try {
				URI uri = new URI("https://www.bgreco.net/hsquote/?source=feferi");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		case ARIES: {
			JOptionPane.showMessageDialog(null,
					"ARIES\nSep 20, 2019\nAttempts to balance emotions with logic may not succeed today, particularly where family is concerned, Aries.\nMembers of your household may be upset, and you might not be able to cheer them up.\nPerhaps all you can do is leave them alone for a while to think.\nOnly they can understand their feelings and discern the right way to proceed.\nLet them know you care, then back off.");
			try {
				URI uri = new URI("https://www.bgreco.net/hsquote/?source=aradia");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		case TAURUS: {
			JOptionPane.showMessageDialog(null, "TAURUS\nSep 20, 2019\nYou might do some writing today, Taurus, perhaps creative or letters.\nWhichever it is, you might find that all that comes out are gloomy accounts of whatever's happening now.\nThis may not reflect your true state of mind.\nIf you can't come up with anything pleasant to write about, perhaps you'd better wait until later!");
			try {
				URI uri = new URI("https://www.bgreco.net/hsquote/?source=tavros");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		case GEMINI: {
			JOptionPane.showMessageDialog(null, "GEMINI\nSep 20, 2019\nA friend may have some outrageous, unworkable ideas for making money, Gemini.\nNo matter what they involve, you'll probably start by listening just to be polite and then end up wondering if your friend is still on this planet.\nThis isn't a good day to get involved in anything risky.\nIf asked, make your excuses.\n\"Risky\"\nis too mild a word for this proposal!");
			try {
				URI uri = new URI("https://www.bgreco.net/hsquote/?source=sollux");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		case CANCER: {
			JOptionPane.showMessageDialog(null, "CANCER\nSep 20, 2019\nCareer matters might be very stressful today, Cancer.\nYour generally penetrating mind is clouded by strong feelings about whatever you're doing and confused by differences of opinion among your colleagues.\nThis could drive you crazy.\nRelax!\nThe world won't come to an end if everything you need to do isn't done today.\nSometimes it's easier to do something when it's OK if you don't do it!");
			try {
				URI uri = new URI("https://www.bgreco.net/hsquote/?source=karkat");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		case LEO: {
			JOptionPane.showMessageDialog(null, "LEO\nSep 20, 2019\nSome new concepts involving the sciences that you're trying to study may be difficult, Leo.\nYou might be a little impatient with yourself, viewing this confusion as a symptom of mental dullness.\nThese ideas could just be new to you.\nDon't be afraid to ask someone to explain things.\nThere are times when hearing it makes it more understandable than reading it.");
			try {
				URI uri = new URI("https://www.bgreco.net/hsquote/?source=nepeta");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		case VIRGO: {
			JOptionPane.showMessageDialog(null, "VIRGO\nSep 20, 2019\nSome vivid dreams could shed light on something you've been trying to find, Virgo.\nThis could be a lost object or an obscure piece of information.\nWhatever it is, you might wake up with some new ideas on where to look for it.\nChances are it's hidden in an obvious place full of similar things.\nDon't hesitate because of the unorthodox source of your insight.");
			try {
				URI uri = new URI("https://www.bgreco.net/hsquote/?source=kanaya");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		case LIBRA: {
			JOptionPane.showMessageDialog(null, "LIBRA\nSep 20, 2019\nA social event could put you in touch with a magnetic woman who has a lot of interesting stories to tell, Libra.\nShe probably exaggerates, so don't take every detail as fact, but you'll enjoy meeting her anyway.\nDon't commit to any proposal that you and she work on a project together.\nShe can be very convincing, but you'll need to think about it carefully before deciding.");
			try {
				URI uri = new URI("https://www.bgreco.net/hsquote/?source=terezi");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		case SCORPIO: {
			JOptionPane.showMessageDialog(null, "SCORPIO\nSep 20, 2019\nToday you might be trying to do some in-depth research, Scorpio, but don't be surprised if what you're looking for proves difficult to find.\nYou could get sidetracked by other interesting subjects related to what you're doing.\nDon't be upset with yourself.\nFinding what you need won't be easy.\nEnjoy the side roads and go back to your search tomorrow.");
			try {
				URI uri = new URI("https://www.bgreco.net/hsquote/?source=vriska");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		case SAGITTARIUS: {
			JOptionPane.showMessageDialog(null, "SAGITTARIUS\nSep 20, 2019\nA decision may need to be made today that requires logic and practicality, Sagittarius.\nYou might find that your feelings get in the way.\nDon't fight it.\nSometimes it's best to step back and discern why your emotions are interfering.\nIs there a hidden factor you may not be considering?\nDo you know all the facts?\nConsider all contingencies before committing.");
			try {
				URI uri = new URI("https://www.bgreco.net/hsquote/?source=equius");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		case CAPRICORN: {
			JOptionPane.showMessageDialog(null, "CAPRICORN\nSep 20, 2019\nToday a charismatic, artistic woman could visit your home, Capricorn.\nShe could have a lot of ideas to discuss, perhaps proposing that you work on a project together.\nThis might be a good idea, but don't commit to it now.\nYour friend has a way of getting people all excited and clouding their judgment.\nWait until she leaves and take some time to think.\nYou'll be in a better space then.");
			try {
				URI uri = new URI("https://www.bgreco.net/hsquote/?source=gamzee");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		}
	}

	public static void main(String[] args) {
		Random rand = new Random();
		int random = rand.nextInt(11);
		switch (random) {
		case 0: {
			horoquote(Zodiac.AQUARIUS);
			break;
		}
		case 1: {
			horoquote(Zodiac.ARIES);
			break;
		}
		case 2: {
			horoquote(Zodiac.CANCER);
			break;
		}
		case 3: {
			horoquote(Zodiac.CAPRICORN);
			break;
		}
		case 4: {
			horoquote(Zodiac.GEMINI);
			break;
		}
		case 5: {
			horoquote(Zodiac.LEO);
			break;
		}
		case 6: {
			horoquote(Zodiac.LIBRA);
			break;
		}
		case 7: {
			horoquote(Zodiac.PISCES);
			break;
		}
		case 8: {
			horoquote(Zodiac.SAGITTARIUS);
			break;
		}
		case 9: {
			horoquote(Zodiac.SCORPIO);
			break;
		}
		case 10: {
			horoquote(Zodiac.TAURUS);
			break;
		}
		case 11:{
			horoquote(Zodiac.VIRGO);
			break;
		}
		}
	}
}
