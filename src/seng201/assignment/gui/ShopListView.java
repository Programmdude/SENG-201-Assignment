package seng201.assignment.gui;

import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.BorderLayout;
import java.awt.Component;

@SuppressWarnings("serial")
class ShopListViewRenderer<T> extends JPanel implements ListCellRenderer<ShopListView<T>> {
    private JLabel lhsLabel;
    private JLabel rhsLabel;

    ShopListViewRenderer() {
        setLayout(new BorderLayout(0, 0));

        lhsLabel = new JLabel();
        rhsLabel = new JLabel();

        add(lhsLabel);
        add(rhsLabel, BorderLayout.EAST);
    }

    public Component getListCellRendererComponent(final JList<? extends ShopListView<T>> list, final ShopListView<T> value,
            final int index, final boolean isSelected, final boolean cellHasFocus) {
        lhsLabel.setText(value.getLhs().toString());
        rhsLabel.setText(value.getRhs());

        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        setEnabled(list.isEnabled());
        setFont(list.getFont());
        setOpaque(true);

        return this;
    }
}

class ShopListView<T> {
    private T lhs;
    private String rhs;

    ShopListView(final T lhs, final String rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public T getLhs() {
        return lhs;
    }

    public String getRhs() {
        return rhs;
    }
}
