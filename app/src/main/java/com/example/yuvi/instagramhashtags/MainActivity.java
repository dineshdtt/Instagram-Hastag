package com.example.yuvi.instagramhashtags;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    private LinearLayoutManager linearLayoutManager;
    private List<TagsModelClass> item_list;
    private ModelAdapter modelAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView= findViewById(R.id.recyclerView);
        item_list= new ArrayList<>();
        modelAdapter= new ModelAdapter(this,item_list);
        linearLayoutManager= new LinearLayoutManager(this);
        recyclerView.setAdapter(modelAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);


        item_list.add(new TagsModelClass
                ("Animals",
                        "#awesome_shots #nature_shooters #vida #fauna #instagood #animales #cute #love #nature #animals #animal #pet #cat #dogs #dog #cats #photooftheday #cute #wild #animalsofinstagram #natgeohub #igs #tagblender #petstagram #petsagram #animallovers #insect #insects #creepy #nature_shooters",
                        R.drawable.copttxt));

        item_list.add(new TagsModelClass
                ("Top 30",
                        "#love #instagood #me #cute #tbt #photooftheday #instamood #iphonesia #tweegram #picoftheday #igers #girl #beautiful #instadaily #summer #instagramhub #iphoneonly #follow #igdaily #bestoftheday #happy #picstitch #tagblender #jj #sky #nofilter #fashion #followme #fun #sun " ,
                        R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Top 60",
                        "#smile #instagramers #pretty #food #friends #like #lol #nature #hair #onedirection #swag #beach #funny #bored #life #cool #blue #dog #pink #art #versagram #sunset #hot #photo #instahub #my #tagblender #family #throwbackthursday #cat " ,
                        R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Top 90",
"#amazing #girls #awesome #clouds #baby #tagblender #party #red #repost #music #black #jj_forum #instalove #all_shots #igaddict #night #followback #yummy #white #bestfriend #green #yum #instago #halloween #school #eyes #harrystyles #sweet #2012 #2013 ",                        R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Likes",
"#l4l #like #likes #liker #likers #tagblender #5likes #10likes #15likes #20likes #25likes #30likes #35likes #40likes #45likes #50likes #55likes #60likes #65likes #70likes #75likes #80likes #85likes #90likes #95likes #100likes #likeforlike #likeall #like4like #likes4likes ",R.drawable.copttxt));

        item_list.add(new TagsModelClass
                ("Bodybuilding",
                        "#bodybuilding #fitness #gym #motivation #fit #workout #fitfam #health #training #fitspo #muscle #fitnessaddict #fitnessmodel #strong #eatclean #healthy #gymlife #diet #cardio #lifestyle #fitnessmotivation #exercise #instagood #shredded #bodybuilder #determination #train #body #photooftheday #bhfyp  ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Fitness",
                        "#instahealth #active #healthychoices #getfit #gains #instafit #abs #like #nutrition #transformation #beastmode #strength #goals #physique #aesthetics #sport #model #powerlifting #aesthetic #ripped #gymmotivation #muscles #love #progress #gymtime #crossfit #fitlife #flex #fashion #girlswholift",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("+FLCS",
                        "#f4f #s4s #l4l #c4c #likeforlike #likeall #like4like #likes4likes #liking #instagood #tagblender #follow #followme #followback #followforfollow #follow4follow #followers #followher #follower #followhim #followbackteam #followall #comment #comments #commentback #comment4comment #commentbelow #shoutout #shoutouts #shoutoutback ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Likes",
                        "#likeforlike #likeall #like4like #likes4likes #liking #instagood #tagblender #tagblender #likesforlikes #ilike #liker #love #ilikeback #liketeam #likealways #tflers #likebackteam #ilikeyou #ilikeit #photooftheday #likes #likesback #likesreturned #likesforlike #likes4followers #ilu #iliketurtles #l4l #likeme #likemeback ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Likes 2",
                        "#l4l #like #likes #liker #likers #tagblender #5likes #10likes #15likes #20likes #25likes #30likes #35likes #40likes #45likes #50likes #55likes #60likes #65likes #70likes #75likes #80likes #85likes #90likes #95likes #100likes #likeforlike #likeall #like4like #likes4likes ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Comments",
                        "#commentbelow #tagblender #comment4comment #comments #commentback #c4c #commentall #commentalways #pleasecomment #commentteam #commentbackteam #photooftheday #commenter #commenting #love #comments4comments #instagood #f4f #s4s #l4l #comment #shoutout #shoutouts #shoutoutback #commentplease #commentsplease #pleasecomments #likecomment #likecommentfollow #commentlike ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Follow me",
                        "#follow #followme #followback #followforfollow #follow4follow #followers #followher #follower #followhim #followbackteam #followall #followbackalways #follows #following #followgram #followalways #tagblender #followstagram #followshoutoutlikecomment #follownow #followus #followmefollowyou #followmeplease #followbackinstantly #f4f #followmeback #followyou #followforlike #ifollowback #ifollow ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Shoutout",
                        "#shoutoutback #shoutout4shoutou #so #so4so #soback #shoutouter #shoutouts #tagblender #shoutout4shoutout #s4s #shoutoutforshoutout #sobackteam #thankyou #shoutmeout #shout_out #shouts #shoutoutpage #shoutouts_4_pets #shoutoutme #shoutoutshere #shoutouts4free #shoutouts_4_cats #shoutoutsforyou #shoutoutplease #f4f #l4l #c4c #followhim #followbackteam #shoutoutsforfree ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Video",
                        "#videogram #awesomevideo #videoshoot #iphonesia #myvideo #love #videoshow #cute #instav #videooninstagram #picoftheday #instamood #tagblender #video #videoclip #tweegram #videooftheday #videography #photooftheday #videodiary #me #instagramvideos #instavideo #instagood #videogames #videostar #videogame #tbt #instagramvideo #videos ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Cats",
                        "#cat #meow #pussycat #picpets #pets #kittensofinstagram #sweet #pet #tagblender #catsofinstagram #kitten #ilovemypet #petsagram #kitty #ilovecats #ilovemycat #instapets #cats #animal #nature #kittens #catlover #life #instacat #cutie #ilovecat #catstagram #catlovers #cutecate #petstagram ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Dogs",
                        "#doggy #dog #cute #adorable #precious #nature #animal #animals #puppy #puppies #pup #petstagram #picpets #cutie #life #petsagram #tagblender #dogs #instagramdogs #dogstagram #dogoftheday #pet #pets #dogsofinstagram #ilovemydog #ilovedog #ilovedogs #doglover #doglovers #tail ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Fish",
                        "#fish #sea #food #water #dolphin #whale #dolphins #ilovefish #ilovefishing #fishingboat #fishingpole #underwater #sealife #underwaterphotograpy #underwaterworld #underwatercamera #underwaterphoto #underwatergram #instafish #tagblender #seafood #seafoods #fishtagram #animals #fisherman #fishy #fishyface #fishys #coral #coralreef ",R.drawable.copttxt));item_list.add(new TagsModelClass
                ("Horse",
                        "#horsebackriding #fast #showjumping #horseshoe #nature #pony #horsey #instanature #riding #animallover #animal #naturegram #naturelovers #animalsofinstagram #horse #horseofinstagram #horsemask #tagblender #horseshow #animallovers #horsepower #ponies #horseriding #horses #instapet #ride #instahorse #petstagram #horsestagram #horsejumping ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Horse",
                        "#ponies #farm #riders #wild #pretty #horse #tagblender #riding #horses_of_instagram #instahorses #jockey #gallop #rider #photooftheday #mane #horseshoe #pony #horseshow #good #nature #horsestagram #horsesofinstagram #grass #cute #horses #ilovemyhorse #beautiful #field #babyhorse #instagood ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Instagram",
                        "#tagblender #popular #iphoneography #like #instamood #instalove #androidography #photography #follow #igers #contests #ig #instafamous #filter #instagram #instagrammers #instagood #photooftheday #hipster #insta #comment #filters #igaddict #instadaily #bestoftheday #photo #shoutout #tflers #picoftheday #popularpage ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("KIK",
                        "#cute #kikmeplease #tagblender #kikmee #kikmegirls #kikmessanger #kikmeguys #instamood #kikster #picoftheday #kikmeimbored #kikmemaybe #pleasekik #kikmessenger #tbt #kikmessage #love #kik #kikit #photooftheday #instagood #letskik #kikmenow #tweegram #iphonesia #instagramhub #instakik #kikme #me #follow ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Snapchat",
                        "#snapchatme #tflers #tagblender #snapchatmeplease #tweegram #snapchatster #snapchatmegirls #chat #snapchatmguys #photooftheday #cute #me #letssnapchat #snapchat #snapit #instamood #iphoneonly #beautiful #picoftheday #instagood #snapback #love #snap #instagramhub #instasnapchat #iphonesia #snapchatmenow #snapchatit #snapchatmemaybe #snapchatmeimbored ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Sports",
                        "#crowd #score #sports #fitness #tagblender #gym #train #health #sportsbrav #winner #trainers #best #trainstation #somuchfun #training #loveit #traintracks #justdoit #active #excercise #instasport #sportscar #sporty #workout #healthy #healthyliving #healthyeating #healthyfood #healthylifestyle #fitnessmodel ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Body",
                        "#tagblender #body #strong #tattoos #beautiful #healthy #gym #smile #igfit #trainer #firm #fat #fashion #skinny #mini #workout #bogo #mermaidsforlife #harry #naturalhairproducts #naturalhair #boys #love #sheamoisture4u #weight #tan #fitfluential #fitspo #happy #watch ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Running",
                        "#instarun #workout #photooftheday #cardio #fitness #runner #fit #runhappy #instagood #furtherfasterstronger #seenonmyrun #runchat #training #marathon #tagblender #happyrunner #trailrunning #score #instafit #sports #runners #runtoinspire #time2run #healthyfood #instarunner #running #trailrun #run #workouttime #trailrunner ",R.drawable.copttxt));

        item_list.add(new TagsModelClass
                ("Yoga ",
                        "#yogapose #tagblender #technique #parsvabakasana #yogafit #instayoga #yogaplay #photobomb #ekapadakoundinyasana #yogapractice #yogalove #yogachallenge #yogagram #yogastretch #lowbackstrength #sidecrow #practiceandalliscoming #bendyyogisflow #yogaforlovers #yogaaddict #yogini #yogahigh #swimming #igyogafam #igyoga #breaststroke #yogalife #inspiredyogis #butterfly #yogagirl ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Workout",
                        "#Fitspo #Fitfam #GirlsWhoLift  #GymLife #Legday #NoPainNoGain #FitLife #GetStrong #Workout #MondayMiles #ChestDay #SeenOnMyRun #TrainHard #Gains #Strengthtraining #Physiquefreak #Fitness #Bodybuilding #Yoga #CrossFit #FitFluential #Fitnessfriday #Flexfriday  #Sundayrunday  #Instarunners #Gym #Movenourishbelieve #Squats",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Healthy",
                        "#Health #EatClean #EatLocal #FitFood #GlutenFree #HealthyEating #HealthyRecipes #Nutrition #Paleo #Vegan #GetHealthy #HealthyLife #HealthTalk #HealthyFoodPorn #IQuitSugar #Detox #Nutrition #CleanEating #AvocadoLove #CalorieCounting #MealPrep #MindBodyGram",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Motivation",
                        "#FitQuote #FitnessMotivation #Fitspo #GetFit #GoalSetting #YouCanDoIt #FitnessGoals #TrainHard #NoExcuses #MondayMotivation #BodyGoals #PhysiqueGoals #Mirrin #Hardworkdedication #GymMotivation #GoGetIt #DreamBig #JustDoIt #Iwill #BestLifeProject #Alwaysinbeta #Betterforit #Findyourstrong",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Pizza",
                        "#PizzaTime #PizzaParty #PizzaLove #PizzaPorn #Pizzagram #PizzaLife #ILovePizza #PizzaGains #PizzaMania #PizzaNight #PizzaHut #PizzaDate #PizzaHeaven #PizzaParadise #PizzaLover #PizzaPie #PizzaGang #PizzaPizza #PizzaBox #PizzaBread #PizzaFloat #PizzaFromAbove #PizzaLove #PizzaBox ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Doughnuts",
                        "#DoughtnutsForDays #DoughnutsAndDeadLifts #DoughnutsAreLife #DoughnutsHole #DoughnutsAndCoffee #DoughnutsTime #DoughnutsLover #DoughnutsMakeMeGoNuts #DoughnutsOfTheDay #DoughnutsFromAbove #DoughnutsForBreakfast #DoughnutsWithDad #DoughtnutSandwich #DoughnutsForDinner #DoughnutsOverload #DoughnutsNotDonuts",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Gym",
                        "#gym #fitness #workout #bodybuilding #fit #motivation #training #fitnessmotivation #sport #muscle #exercise #gymlife #strong #healthy #fitfam #diet #instagood #gymmotivation #health #dieta #bodybuilder #body #palestra #nutrition #follow #weightloss #gymtime #love #lifestyle #bhfyp ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("CrossFit",
                        "#crossfit #instafit #gains #fitnessmodel #yoga #prote #personaltrainer #like #personaltraining #art #model #gymnastics #fitspo #nike #hardwork #l #cardio #n #entrenamiento #bicipiti #shredded #abs #squat #muscles #redcon #hot #wellness #dance #a #nopainnogain",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Muscle",
                        "#muscle #fitness #gym #bodybuilding #fit #motivation #workout #fitfam #gt #gymlife #life #mustang #fitnessmotivation #health #v #shredded #cars #gains #musclecar #americanmuscle #car #body #training #carporn #mustangsofinstagram #abs #mustanggt #instafit #horsepower #bhfyp ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Muscle 2",
                        "#strong #coyote #fordmustang #mustangfanclub #V #roush #cobra #stang #mustangs #healthy #eatclean #stangsandfangs #newedge #fordracing #worldwidestangs #saleen #fitspo #AM #sn #beastmode #fitnessmodel #exercise #fitnessaddict #bodybuilder #dedication #cardio #lifestyle #physique #instagood #nutrition",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Gym Life",
                        "#gymlife #fitness #gym #bodybuilding #fit #motivation #fitnessmotivation #workout #fitfam #muscle #shredded #health #gymmotivation #gains #fitnessmodel #instafit #training #strength #fitnessaddict #gymtime #bodybuilder #fitlife #eatclean #beastmode #lifestyle #goals #body #fitspo #gymrat #bhfyp ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Gym Life2",
                        "#healthy #dedication #cardio #nutrition #instafitness #exercise #inspiration #progress #life #abs #diet #physique #getfit #ripped #transformation #fitnessgirl #bodygoals #fitnesslife #weightlifting #change #cleaneating #gymaddict #fitnessjourney #bbg #determination #muscles #grind #fitspiration #like #train",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Power-Lifting",
                        "#powerlifting #transformation #body #cardio #focus #grind #lifestyle #calisthenics #nutrition #tattoos #ISYMFS #personaltrainer #inspiration #exercise #flex #DEADLIFT #BACKDAY #fitlife #SQUATS #BENCHPRESS #PERSONALTRAINER #squats #LEGDAY #trainhard #YOUVSYOU #STRENGTH #FITNESS #ENTREPRENEUR #NOWACCEPTINGCLIENTS #ALLWEDOISWORK",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Girl",
                        "#girly #fashion #girl #instafashion #model #instagood #style #beauty #cute #love #follow #beautiful #makeup #stylish #pretty #photography #pink #shoes #girls #dress #photooftheday #outfit #like #styles #eyes #me #heels #hair #summer #bhfyp ",R.drawable.copttxt));
        item_list.add(new TagsModelClass
                ("Fashion",
                        "#blackandwhite #purse #shopping #portrait #followme #ootd #editorial #cosmetics #Girly #jewelry #skirt #unicorn #igmakeup #photo #bblogger #gerardcosmetics #aesthetic #fitness #makeupaddict #abs #makeupporn #picoftheday #fashionable #photographer #followforfollow #hot #selfie #art #happy #Fashion",R.drawable.copttxt));

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem menuItem= menu.findItem(R.id.search);
        SearchView searchView= (SearchView) MenuItemCompat.getActionView(menuItem);
        searchView.setOnQueryTextListener(this);
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        newText= newText.toLowerCase();
        ArrayList<TagsModelClass> newList= new ArrayList<>();

        for(TagsModelClass tagsModelClass : item_list) {
            String name = tagsModelClass.getTagsName().toLowerCase();
        if (name.contains(newText))
            newList.add(tagsModelClass);
        }

        modelAdapter.setFilter(newList);

        return true;
    }
}
