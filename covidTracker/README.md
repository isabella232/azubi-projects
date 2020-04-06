CovidTracker
=============

_The app that keeps you safe_


Baue eine Softwarelösung für die aktuelle Covid Pandemie! Helfe Kontaktpersonen herauszufinden, die mit positiv getesteten Personen Kontakt hatten oder selbst positiv wurden.

Aufgaben
--------

**Umgebungcheck**

Als CovidTracker Nutzer möchte ich informiert werden, wenn in meiner näheren Umgebung ein Covid Positiv Mensch sich aufhält.


**Meldung**

Als CovidTracker Nutzer möchte ich mein Netzwerk darüber informieren, dass ich positiv getestet bin bzw. selbst benachrichtigt werden über _Push Notifications_ vom Browser!


**Verlauf**

Als CovidTracker Nutzer möchte ich informiert werden, wenn ich in den letzten 48 Stunden in der Nähe einer Person war, die vor kurzem positiv getestet wurde.


Mögliche Lösung
---------------

Euer Browser kann die GPS Daten zugreifen. Backend nimmt Daten entgegen, speichert diese in einer DB und gibt dann die berechneten Antworten zurück. 


Fragen
-------

... die du dir stellen solltest:

- Wie sieht das Datenmodell im Backend aus?
- Wie kann ich die App anonym machen? brauche ich Namen? 
- Wie komme ich an die GPS Daten ran?
- Wie berechne ich mit GPS Nähe? Was heißt Nähe? 1m entfernt? Wie genau ist gps?
- Wie kann ist sowas testen ohne GPS zu haben?


 -- easy peasy :-)   
 
 
BattlePlan
----------
 
*first day*

- Male auf Papier (oder digital) deine technischen Überlegungen
- Male Sequenzdiagramme über die Kommunikation der einzelen Komponenten (User, FE, BE, DB, ...)
- Überlege dir das Datenmodell, mach mal ein ER-Diagramm falls es Sinn macht
 
*second day*
- Schreibe detaillierte Use-Case zu deinen Usecases :) Was ist ein detaillierter use-case? https://www.dummies.com/business/business-strategy/how-to-create-use-case-description-for-your-business-analysis-report/

*third day*
- Was ist ein Milestone im Context Software Entwicklung?
- Erkläre den Xtreme Progrmaming cycle... gibts dort auch Milestones?

- Überlege dir welche Milestones du erreichen musst, damit die App Wert schafft und dann erzeuge diese bei github in deinem Projekt.
- Jetzt überlege dir, welche Aufgaben gemacht werden um den ersten Milestone zu erreichen und schreibe diese mit Akzeptanzkriterien in Form von Userstories als github isssues. Der Titel des Issues sollte sprechend sein! (z.B. "track user status endpoint" oder "user status upload form")

- Warum ist es KEINE gute Idee, alle Tickets zu schreiben, die für alle anderen Milestones nötig sind?
 
*fourth day*
- Lese das 4te Kapitel von Implementation Patterns "Motivation" und erkläre die Kosten eines Software-Projekts. Sind alle Projekte gleich? Wann gelten die Aussagen von Kent Beck nicht?
- Wie kannst du die Kosten deiner Software gering halten?
- du findest das Buch nicht? https://epdf.pub/implementation-patterns.html

