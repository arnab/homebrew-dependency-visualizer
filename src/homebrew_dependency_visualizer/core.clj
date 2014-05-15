(ns homebrew-dependency-visualizer.core
  (:require [homebrew-dependency-visualizer.shell :as shell]))

(defn brew-executible
  "find the absolute location of the brew executible"
  []
  (shell/exec ["which" "brew"]
              "find homebrew"))
