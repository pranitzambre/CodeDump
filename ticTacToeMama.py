def printtictactoemama(values):
    print("\n")
    print("\t     |     |")
    print("\t  {}  |  {}  |  {}".format(values[0], values[1], values[2]))
    print('\t_____|_____|_____')

    print("\t     |     |")
    print("\t  {}  |  {}  |  {}".format(values[3], values[4], values[5]))
    print('\t_____|_____|_____')

    print("\t     |     |")

    print("\t  {}  |  {}  |  {}".format(values[6], values[7], values[8]))
    print("\t     |     |")
    print("\n")


# Function to print the score-board
def printscoreboard(scoreboard):
    print("\t              SCOREBOARD       ")
    print("\t--------------------------------")

    players = list(scoreboard.keys())
    print("\t   ", players[0], "\t    ", scoreboard[players[0]])
    print("\t   ", players[1], "\t    ", scoreboard[players[1]])

    print("\t--------------------------------\n")


# Function to check if any player has won
def checkingwinner(player_pos, currentplayer):
    soln = [[1, 2, 3], [4, 5, 6], [7, 8, 9], [1, 4, 7], [2, 5, 8], [3, 6, 9], [1, 5, 9], [3, 5, 7]]

    for x in soln:
        if all(y in player_pos[currentplayer] for y in x):
            return True
    return False

def checkdraw(player_pos):
    if len(player_pos['X']) + len(player_pos['O']) == 9:
        return True
    return False


def singlegame(currentplayer):
    values = [' ' for X in range(9)]

    player_pos = {'X': [], 'O': []}

    # Game Loop
    while 1:
        printtictactoemama(values)

        try:
            print("Player ", currentplayer, " turn. Which box? : ", end="")
            move = int(input())
        except ValueError:
            print("Invalid choice. Try Again!")
            continue

        if move < 1 or move > 9:
            print("Invalid choice. Try Again!")
            continue

        if values[move - 1] != ' ':
            print("Place already filled. Choose a different place!")
            continue

        values[move - 1] = currentplayer

        player_pos[currentplayer].append(move)

        if checkingwinner(player_pos, currentplayer):
            printtictactoemama(values)
            print("PLAYER ", currentplayer, " WON THE GAME!")
            print("\n")
            return currentplayer

        if checkdraw(player_pos):
            printtictactoemama(values)
            print("Game Drawn.")
            print("\n")
            return 'D'

        if currentplayer == 'X':
            currentplayer = 'O'
        else:
            currentplayer = 'X'


if __name__ == "__main__":

    print("Player 1")
    player1 = input("Enter name : ")
    print("\n")

    print("Player 2")
    player2 = input("Enter name : ")
    print("\n")

    currentplayer = player1

    player_choice = {'X': "", 'O': ""}

    options = ['X', 'O']

    scoreboard = {player1: 0, player2: 0}
    printscoreboard(scoreboard)

    while 1:

        print("Turn to choose for ", currentplayer)
        print("Enter 1 for X.")
        print("Enter 2 for O.")
        print("Enter 3 to Quit.")

        try:
            choice = int(input())
        except ValueError:
            print("Invalid choice. Try Again! \n")
            continue

        if choice == 1:
            player_choice['X'] = currentplayer
            if currentplayer == player1:
                player_choice['O'] = player2
            else:
                player_choice['O'] = player1

        elif choice == 2:
            player_choice['O'] = currentplayer
            if currentplayer == player1:
                player_choice['X'] = player2
            else:
                player_choice['X'] = player1

        elif choice == 3:
            print("Final Scores: ")
            printscoreboard(scoreboard)
            break

        else:
            print("Invalid choice. Try Again!\n")

        winner = singlegame(options[choice - 1])

        if winner != 'D':
            playerwon = player_choice[winner]
            scoreboard[playerwon] = scoreboard[playerwon] + 1

        printscoreboard(scoreboard)
        if currentplayer == player1:
            currentplayer = player2
        else:
            currentplayer = player1