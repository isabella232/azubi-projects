     _____  ____  ___  ____  ____  _  _  __    ____  ____  __    ____  ____  _  _ 
    (  _  )(  _ \/ __)( ___)(  _ \( \/ )/__\  (  _ \(_  _)(  )  (_  _)(_  _)( \/ )
     )(_)(  ) _ <\__ \ )__)  )   / \  //(__)\  ) _ < _)(_  )(__  _)(_   )(   \  / 
    (_____)(____/(___/(____)(_)\_)  \/(__)(__)(____/(____)(____)(____) (__)  (__) 

Observability - the art to see the needle in the haystack

                                                              
      ,---.           ,---.               ,--.               ,--. 
     /  O  \ ,--.,--./  .-' ,---.  ,--,--.|  |-.  ,---.     /   | 
    |  .-.  ||  ||  ||  `-,| .-. |' ,-.  || .-. '| .-. :    `|  | 
    |  | |  |'  ''  '|  .-'' '-' '\ '-'  || `-' |\   --.     |  | 
    `--' `--' `----' `--'  .`-  /  `--`--' `---'  `----'     `--' 
                            `---'                                  
What is Observability? What is Monitoring? What is the difference?

please read https://hackernoon.com/monitoring-vs-observability-25ab98179814 
and answer the questions and try to explain the difference using your own CovidTracker App!


                                                                
      ,---.           ,---.               ,--.               ,---.  
     /  O  \ ,--.,--./  .-' ,---.  ,--,--.|  |-.  ,---.     '.-.  \ 
    |  .-.  ||  ||  ||  `-,| .-. |' ,-.  || .-. '| .-. :     .-' .' 
    |  | |  |'  ''  '|  .-'' '-' '\ '-'  || `-' |\   --.    /   '-. 
    `--' `--' `----' `--'  .`-  /  `--`--' `---'  `----'    '-----' 
                           `---'                                    
Logging stuff that matters is hard. First you have to know what matters (that is domain knowledge) 
and then there is the technical challenge of logging! You already know Printf Debugging (in java System.out.println)

Here is a controversial opinion: https://lemire.me/blog/2016/06/21/i-do-not-use-a-debugger/ Do you agree?

Debugging is done during development, but what about a service that has been running for a few weeks now? In Heroku 
you can see the logs ... if you did some println statements! But there is a better way! LOGGGING like a pro! Checkout https://www.loggly.com/ultimate-guide/java-logging-basics/. 

Please replace all your println statements with the java.util.logging tools! I want to see those nice logging statements and a nice property configuration in your code. Give me that commit !!!


       ('-.                                          ('-.    .-. .-')    ('-.                  
      ( OO ).-.                                     ( OO ).-.\  ( OO ) _(  OO)                 
      / . --. / ,--. ,--.      ,------. ,----.      / . --. / ;-----.\(,------.       .-----.  
      | \-.  \  |  | |  |   ('-| _.---''  .-./-')   | \-.  \  | .-.  | |  .---'      /  -.   \ 
    .-'-'  |  | |  | | .-') (OO|(_\    |  |_( O- ).-'-'  |  | | '-' /_)|  |          '-' _'  | 
     \| |_.'  | |  |_|( OO )/  |  '--. |  | .--, \ \| |_.'  | | .-. `.(|  '--.          |_  <  
      |  .-.  | |  | | `-' /\_)|  .--'(|  | '. (_/  |  .-.  | | |  \  ||  .--'       .-.  |  | 
      |  | |  |('  '-'(_.-'   \|  |_)  |  '--'  |   |  | |  | | '--'  /|  `---.      \ `-'   / 
      `--' `--'  `-----'       `--'     `------'    `--' `--' `------' `------'       `----''  

Now it is time to step up your game. Head over to loggly.com and get a free account. Loggly is a service that allows you to query your logs ! How cool is that???? Imaging your sales people asking you how many users are using your covidtracking app. Without such a service you can't answer that (unless you have a metrics system in place, but that is a different story altogether).

Get an account, setup your heroku app to stream those logs to loggy. Google is your friend. And since I am your friend too, i give you a link: 
https://lmgtfy.com/?q=loggly.com+use+a+drain+to+send+your+application+logs+to+loggly
