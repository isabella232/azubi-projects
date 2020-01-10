newsPaperApp
============

Der Kunde benötigt eine App, die ihr aktuelle Nachrichten zu einem Begriff anzeigt. Diese App sollte aus dem Internet erreichbar sein, jedoch nur mit einem Password verwendet werden können. Der Kunde verwendet einen Browser und ab und zu sein Handy.

Folgende API kannst du verwenden: https://sandbox-api.ipool.asideas.de

Um die letzten 5 Artikel zu finden, die das Wort 'Putin' beinhalten machst du folgende Anfrage: https://sandbox-api.ipool.asideas.de/sandbox/api/search?q=Putin&limit=5

Zeitrahmen
------------
Du hast eine Woche Zeit für die Umsetzung. 

Zur Vorbereitung
----------------
- Beschreibe anfangs die Nutzerinteraktion (UML interaction diagram)
- Male einen low fidelity UI Sketch für Browser und Handy 
- Überlege danach wie die Software Komponenten / Architektur aussehen könnte, bzw. wie du das Problem in Teilbereiche zerlegen kannst (pseudo UML)
- Plane die Woche mit konkreten User Stories sowie Task Breakdown (Sub Tasks)


Anmerkungen
-----------

Es sollte ein automatische Deployment (commit -> testing -> deployment) eingerichtet sein. Du committest deine Änderungen, es werden Tests ausgeführt und bei Erfolg ein Deployment durchgeführt.

Schreibe Unit-tests für kleine Funktionalitäten der Komponenten.

Schreibe Acceptance tests um die Nutzerinteraktion deiner Anwendung zu testen. 

Bitte verwende für das Projekt die Programmiersprache Javascript. Für das Backend node.js und für das Frontend html, css und JavaScript. Wir empfehlen für das Backend das npm paket 'express.js'. 