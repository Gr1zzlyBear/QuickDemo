package com.company;


import java.lang.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Main {

    public static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "/Users/rayrahat/Downloads/chromedriverz");

            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://cms-admin-tools-dev-ucxolgeeaq-uw.a.run.app/");
        driver.manage().window().maximize();

            //login feature
        //putting in email
       WebElement email=  driver.findElement(By.id("email"));
       email.sendKeys("napster.demo.admin@test.com");

       //putting in password
        WebElement password=  driver.findElement(By.id("password"));
        password.sendKeys("StrongPass123");

        // Clicking on Login
        WebElement Login =  driver.findElement(By.id("btn-login"));
        Login.click();

//        Searching for a track
        WebElement searchTrack = driver.findElement(By.id("search"));
        searchTrack.sendKeys("ray");


//         Searching by Type
//        WebElement typeDropDown = driver.findElement(By.id("headlessui-listbox-button-3"));  this also works
        WebElement typeDropDown = driver.findElement(By.id("search-type"));
        typeDropDown.click();
        WebElement trackName = driver.findElement(By.xpath("//*[text()='Track Name']"));
        trackName.click();
        //WebElement searchBttn =  driver.findElement(By.cssSelector("button[type='button']"));
//        WebElement searchBttn =  driver.findElement(By.cssSelector("button[class='justify-center']"));
        WebElement searchBttn =  driver.findElement(By.cssSelector("div[class='w-full mb-16 sm:mb-0 sm:w-1/2']"));
        searchBttn.click();

        Thread.sleep(5000);

//
        //clicking on Generes Tab
        WebElement genreTab =  driver.findElement(By.cssSelector("span[title='Genre Editor']"));
        genreTab.click();
        Thread.sleep(5000);
        // clicking on Add new Genre
        WebElement addNewGenere =  driver.findElement(By.id("add-genre"));
        addNewGenere.click();

// putting in the name
        WebElement genereName= driver.findElement(By.name("names[0].value"));
        genereName.sendKeys("Bear");

//        //putting in the description
        WebElement genreDescription = driver.findElement(By.name("descriptions[0].value"));
        genreDescription.sendKeys("This is an actual Bear");
        Thread.sleep(5000);

        //submitting the new genre
        WebElement genresubmit =  driver.findElement(By.cssSelector("button[type='submit']"));
        genresubmit.click();

//        //putting in the search for genre
        WebElement searchGenre = driver.findElement(By.id("search"));
        searchGenre.sendKeys("Bear");

        // Using the genrescrollbox
        WebElement genreScroll =  driver.findElement(By.cssSelector("div[class='relative mt-1']"));
        genreScroll.click();
        WebElement genreName =  driver.findElement(By.xpath("//*[text()='Genre Name']"));
        genreName.click();
        WebElement searchGBttn =  driver.findElement(By.cssSelector("div[class='w-full mb-16 sm:mb-0 sm:w-1/2']"));
        searchGBttn.click();
        Thread.sleep(5000);

        //Going to Artist Editor then selecting an Artist and entering
        WebElement artistTab =  driver.findElement(By.cssSelector("span[title='Artist Editor']"));
        artistTab.click();
        Thread.sleep(3000);
        WebElement searchArtist = driver.findElement(By.id("search"));
        searchArtist.sendKeys("Ray");
        WebElement artistScroll =  driver.findElement(By.xpath("//*[text()='Select']"));
        artistScroll.click();
        WebElement artistName  = driver.findElement(By.xpath("//*[text()='Artist Name']"));
        artistName.click();
        Thread.sleep(3000);
        WebElement artSearchGBttn =  driver.findElement(By.cssSelector("div[class='w-full mb-16 sm:mb-0 sm:w-1/2']"));
        artSearchGBttn.click();
        WebElement foundArtist =  driver.findElement(By.xpath("//*[text()='6134f0109cb2e2fe66a70014']"));
        foundArtist.click();
        Thread.sleep(3000);
        WebElement editArtistGenres =  driver.findElement(By.xpath("(//*[@class='svg-inline--fa fa-edit fa-w-18 mx-2 text-lg'])[3]"));
        editArtistGenres.click();
        //Looking for the genre
        WebElement searchNewGenre = driver.findElement(By.id("search"));
        searchNewGenre.sendKeys("Bear");
        WebElement searchNewGenreScroll =  driver.findElement(By.cssSelector("div[class='relative mt-1']"));
        searchNewGenreScroll.click();

        WebElement searchNewGenreScrollName  = driver.findElement(By.xpath("//*[text()='Genre Name']"));
        searchNewGenreScrollName.click();

        WebElement searchNewGenreScrollNameSearch  = driver.findElement(By.cssSelector("div[class='w-full mb-16 sm:mb-0 sm:w-1/2']"));
        searchNewGenreScrollNameSearch.click();
        WebElement selectingGenre = driver.findElement(By.xpath("//*[text()='614fe2ec56e79b7b193bc0c2']"));
        selectingGenre.click();
        WebElement save=  driver.findElement(By.xpath("//*[text()='Save']"));
        save.click();





//        WebElement searchTrack = driver.findElement(By.id(""));
//        //putting in the dropdown box
//        WebElement searchTrack = driver.findElement(By.id(""));
//        //clicking on the artist editor
//        WebElement searchTrack = driver.findElement(By.id(""));
//        //clicking on the add new artist
//        WebElement searchTrack = driver.findElement(By.id(""));
        //
        }
    }

