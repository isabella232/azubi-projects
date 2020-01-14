jquery
======


Aufgabe 1
---------
Zur Unterstützung deiner Arbeit kannst du ein Framework oder eine Bibliothek verwenden.

Wo ist der Unterschied zwischen einem Framework und einer Bibliothek?

Aufgabe 2
---------

Einer der wichtigsten Bibliotheken im Internet ist jquery. Jquery unterstützt dich dabei, den DOM zu manipulieren.

Was ist der DOM? 


Aufgabe 3
---------

Gehe über die w3c Dokumentation (https://www.w3schools.com/jquery/jquery_intro.asp) von jquery und beantworte danach folgende Fragen:

Welche Farbe hat welche Überschrift?

```html
<h1 class="headline">Hello</h1>
<h2 class="headline">Hello again</h2>
<h2 class="not_headline">Hello again again</h3>
<script>
$(".headline").css("color", "red");
</script>
``` 

Wenn ich den button "show b" und danach "show a" clicke, welcher Text wird angezeigt? 

```html
<button id="showA"> show a</button>
<button id="showB"> show b</button>
<article class="screen" id="screen_A"> hi there from A</article>
<article class="screen" id="screen_B"> hi there from B</article>
<script>
    $(".screen").hide();
    $("#showA").click(() => {
        $("#screen_A").show();
    });

    $("#showB").click(() => {
        $("#screen_B").show();
    });
    </script>
```