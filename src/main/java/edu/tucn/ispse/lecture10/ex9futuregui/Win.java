package edu.tucn.ispse.lecture10.ex9futuregui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 * @author Radu Miron
 * @version 1
 */
public class Win extends JFrame {
    public Win() {
        super("Crypto Market");
        this.setSize(700, 200);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // columns and data
        String[] columns = {"Rank", "Name", "Price (USD)", "MarketCap (USD)"};
        Object[][] data = {
                {"1", "Bitcoin", 0.00, 0.00},
                {"2", "Ethereum", 0.00, 0.00},
                {"3", "Tether", 0.00, 0.00}
        };

        // create a table model
        DefaultTableModel model = new DefaultTableModel(data, columns);

        // create JTable with the model
        JTable table = new JTable(model);

        // create a JScrollPane to hold the table
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 10, 680, 100);

        // create JButton to refresh data
        JButton refreshButton = new JButton("Refresh data");
        refreshButton.setBounds(10, 130, 680, 20);
        refreshButton.addActionListener(e -> refreshData(model));

        this.add(scrollPane);
        this.add(refreshButton);
        this.setVisible(true);
    }

    private void refreshData(DefaultTableModel model) {
        // clear the existing rows
        model.setRowCount(0);

        // get coins' data
        List<Coin> coins = ApiUtils.getCoins();
        coins.forEach(c -> model.addRow(new Object[]{
                c.data().rank(),
                c.data().name(),
                c.data().priceUsd(),
                c.data().marketCapUsd()}));
        model.fireTableDataChanged();
    }
}
