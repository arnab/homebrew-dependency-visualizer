(ns homebrew-dependency-visualizer.shell
  (:require [clojure.java.shell :as shell :only [sh]]
            [clojure.string :as str :only [join trim-newline]])
  (:import java.io.IOException))

(defn exec
  "executes a shell command and returns the output. Throws the error if the
   command was not succesful, with a message."
  [cmd msg]
  (let [{:keys [exit out err]} (apply shell/sh cmd)]
    (if (zero? exit)
      (str/trim-newline out)
      (throw (IOException. (str "Couldn't " msg ". "
                                "Command used: '" (str/join " " cmd) "'. "
                                "Exit code: " exit ", Error:" err "."))))))
