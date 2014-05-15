(ns homebrew-dependency-visualizer.core
  (:require [homebrew-dependency-visualizer.shell :as shell]
            [clojure.string :as str only [split]]))

(defn brew-executible
  "find the absolute location of the brew executible"
  []
  (shell/exec ["which" "brew"]
              "find homebrew"))

(defn list-packages
  "returns a list of homebrew packages foubd on the system"
  []
  (let [msg "list installed homebrew packages"
        brew (brew-executible)
        pkgs (shell/exec [brew "list"] msg)]
    (str/split pkgs #"\n")))

;# (list-packages)
