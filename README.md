# Jukebox-backend
Diese Webanwendung wurde im Rahmen der Vorlesung Software Engeneering Selective erstellt. 
Das Projekt besteht aus zwei Teilen. Das hier zu sehnde [Frontend](https://github.com/davidm15/Jukebox-frontend)und das [Backend](https://github.com/davidm15/Jukebox-backend).

# Inhaltsverzeichnis
1. [Übersicht](#Übersicht)
2. [Aufbau](#Aufbau)
3. [Entwicklungsschritte](#Entwicklungsschritte)
4. [Probleme](#Probleme)
5. [Beteiligte](#Beteiligte)

# Übersicht
Das Projekt soll eine Musikbibliothek darstellen. Dabei kann ein Administrator bzw. Berechtiger auf Benutzer und Lieder zugreifen.
Die Grundfunktionen bestehen aus Erstellen, Ändern und Löschen der beiden Komponenten. Außerdem können die beiden Komponenten in einer Detailansicht näher betrachtet werden.
Neben diesen Funktionen werden zur besser Übersicht Statistiken in Form von Graphen angezeigt, sowie eine Übersetzungsfunktion Englisch/Deutsch angeboten.
 
# Aufbau
Die Webseite wurde nach dem allgemeine "Look and Feel" Prinzip angelegt. So wird eine Navigationsleisten am oberen Rand,
sowie eine Sidebar am linken Rand der Webseite angezeigt. Über den Button Graph/Dashboard, Songs oder User lassen sich die verschiedenen Funktionen erreichen.
Das hier als Grundlage verwendete Template ist unter [SB Admin v5.0](http://startbootstrap.com/template-overviews/sb-admin-2/) einsehbar.

## Graph/Dashboard:

Hier werden die Statistiken angezeigt.

## Songs:

Die Songs werden in Form einer Tabelle angezeigt. Über diese Tabelle lassen sich die Songs wählen, um in die Detailansicht zu kommen. 
Von da aus lassen sich diese Löschen oder Editieren. In der Tabellenansicht können weitere Songs angelegt oder gesucht werden.

## Users:

Hier werden die gleichen Funktione wie unter Songs zur Verfügung gestellt.

# Entwicklungsschritte

Die Grundlegende verteilung der Arbeitsschritte liegt der Entitätsstruktur zugrunde. So wurden die beiden Entitäten Songs und Users von jeweils einem der beiden Beteiligten bearbeitet.
So wurde im ersten Schritt die Grundlage für die Arbeit mit der Datenbank geschaffen. Darauf aufbauend konnten diese Daten über die API für die Webseite abgerufen werden.
Neben diesen Hauptbestandteilen bzw. den Hauptfunktionen wurde eine Basic Authentification, Übersetzung, graphische Anzeige und Validation angestrebt.

# Probleme
- Eine  Basic Authentification findet derzeit mit Hardcode Credentials statt. Ein Benutzter Directory gibt es nicht.
- Die Abhängigkeit von einem User zu dessen Songs hat sich als schwieriger herrausgestellt als angenommen.
- Die geplante Startseite mit Grafiken und Statistiken wird es nur in einer abgeschwächten Form geben.


# Beteiligte
David Mischak und Sebastian Hörber
