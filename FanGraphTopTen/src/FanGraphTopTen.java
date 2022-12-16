import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;


public class FanGraphTopTen{
	static ArrayList<Double>getAvg() throws IOException{
		Document doc = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2020&ind=0&team=&rost=&age=&filter=&players=&startdate=&enddate=").get();
		ArrayList<Double>names = new ArrayList<Double>();
		Elements elem = doc.select("tbody");
		
		for(Element tr: elem.select("tr")) {
			int tableColumn = 0;
			for(Element td: tr.select("td.grid_line_regular")) {
				tableColumn += 1;
				if(tableColumn == 2) {
					Double average = Double.valueOftr.select("td_grid_line_break.rgSorted".text());
					average.add(averages);
					
				}
			}
		}
		
	}
	static ArrayList<String> getNames() throws IOException {
		Document doc = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2020&ind=0&team=&rost=&age=&filter=&players=&startdate=&enddate=").get();
		
		//ArrayList<Double> averages =  new ArrayList<Double>();
		
		ArrayList<String>names = new ArrayList<String>();
		//Document doc = Jsoup.connect(html).get();
		Elements elem = doc.select("tbody");
		
		for(Element tr: elem.select("tr")) {
			int tableColumn = 0;
			for(Element td: tr.select("td.grid_line_regular")) {
				tableColumn += 1;
				if(tableColumn == 2) {
				String name = td.text();
				names.add(name);
			}
			}}
		return names ;
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(getNames());
		/*String[] ranks2020 = new String[50];
		String[] ranks2021 = new String[50];
		String[] ranks2022 = new String[50];
		*/
		}}/*
		try {
		Document document22 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0").get();
		//Document document21 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0").get();
		Document document20 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=0").get();
		String text22 = document22.body().text();
		//String text21 = document21.body().text();
		String text20 = document20.body().text();
		
		
		String title= document22.title();
		//String text = document.body().text();
		System.out.println("Title: "+title);
		System.out.println("Text: "+text22);
		
		Elements links = document22.select("tbody");
		int counter = 0;
		for(Element link : links.select("td.grid_line_regular")) {
			final String NAME = link.select("a").text();
			if(NAME != "" && NAME.length()>3) {
				ranks2022[counter]=NAME;
				counter++;
				System.out.println(NAME);
				
			}
			try {
				Document document21 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0").get();
				String text21 = document21.body().text();
				Elements links = document21.select("tbody");
				
				Elements links = document22.select("tbody");
				int counter = 0;
				for(Element link : links.select("td.grid_line_regular")) {
					final String NAME = link.select("a").text();
					if(NAME != "" && NAME.length()>3) {
						ranks2022[counter]=NAME;
						counter++;
						System.out.println(NAME);
				
			}
			
		}
			
		
		
		}
		catch(Exception io){
			io.printStackTrace();
		}
		System.out.println();
	
}}*/
