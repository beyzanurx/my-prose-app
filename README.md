# My Prose App

Ein interaktives Maven-basiertes Java-Projekt, das im Rahmen des Kurses "Open Source Software Development" entstanden ist. Die Anwendung nutzt ein modulares System, um dynamisch Sätze aus verschiedenen Abhängigkeiten (Dependencies) über das GitHub Packages Repository zu laden, zu kombinieren und auf dem Terminal auszugeben. Das Prinzip ähnelt dem klassischen Falttext-Erzählspiel (*Folded Paper Storytelling Game*).

## Features
* **GitHub Packages Integration:** Nutzt externe Repositories als Abhängigkeiten über eine gesicherte Authentifizierung.
* **Modulare Architektur:** Dynamische Registrierung von Satzteilen über ein zentrales Interface (`Sentence`).
* **Automatisierte Qualitätssicherung:** Vollständige Abdeckung der Kernmethoden durch JUnit 5 Komponententests und automatische Validierung via GitHub Actions bei jedem Pull Request.

## Voraussetzungen
* **Java Development Kit (JDK):** Version 17 oder höher
* **Apache Maven:** Version 3.8+
* **GitHub Personal Access Token (PAT):** Wird für die Authentifizierung beim Download/Upload der GitHub Packages benötigt.

## Installation & Setup

### 1. GitHub Authentifizierung konfigurieren
Damit Maven die benötigte `prose-builder`-Bibliothek herunterladen kann, muss dein GitHub-Token in deiner globalen Maven-Konfiguration hinterlegt sein.